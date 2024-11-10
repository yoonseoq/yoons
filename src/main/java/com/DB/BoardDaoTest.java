package com.DB;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        Board board = null;
        insert(dao);
        // delete(dao);
        //update(dao);
    }


    private static void insert(BoardDao dao) {
        Board board = new Board();
        board.setTitle("어머벌써 새벽한시");
        board.setContents("6시간 수면은 보장받아야한다");
        board.setWriter("おやすみなさい");
        int result = dao.insBoard(board);
        System.out.println("result:" + result);

    }

    private static void delete(BoardDao dao) {
        //Board board=new Board();
        //board.setBoardId(1);

        int result = dao.delBoard(1);

        //dao 클래스의 delBoard 메소드를 호출하고 없앨 boardId를 입력
        //그리고  삭제된 튜플의 정보를 result 에다가 복사

        System.out.println("delete:" + result);
    }

    private static void update(BoardDao dao) {

        Board board = new Board();
        board.setTitle("어머벌써새벽한시");
        board.setContents("6시간은자야함");
        board.setWriter("윤 자자");
        board.setBoardId(2);

        int result = dao.upBoard(board);

        System.out.println("update" + result);

    }
}

