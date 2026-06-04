public int getPointsForRow(int targetRow) {
  int count = 0;
  Boolean isCol = true;
  String sameCol = board[targetRow][0].getColor();

  for (int i = 0; i < board[targetRow].length; i++) {
    count += board[targetRow][i].getPoints();
    if (! sameCol.equals(board[targetRow][i].getColor()) {
      isCol = false;
  }

  if (isCol) {
    return 2 * count;
  }
  else {
    return count;
  }

}
