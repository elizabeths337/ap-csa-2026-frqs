public int getPointsForRow(int targetRow) {
  int count = 0;
  Boolean isCol = True;
  for (int i = 0; i < board.length; i++) {
    String sameCol = board[targetRow][0].getColor();
    count += board[targetRow][i].getPoints();
    if (! sameCol.equals(board[targetRow][i].getColor();
      isCol = False;
  }
  if (isCol) {
    return 2 * count;
  }
  else {
    return count;
  }
}
