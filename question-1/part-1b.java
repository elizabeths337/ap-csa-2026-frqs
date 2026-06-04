public String getShortenedName() {
  String short = "";
  if ( username.substring(0,1).equals("-") || username.substring(username.length() - 1).equals("-") || username.length() < 2 || username.indexOf("--") > -1) {
    return username;
  }
  
  for (int i = 0; i < username.length(); i++) {
    if (username.substring(i,i+1).equals("-")) {
      short = short.substring(0,short.length()-1);
    } else {
      short += username.substring(i,i+1);
    }
  }
  return short;
}
