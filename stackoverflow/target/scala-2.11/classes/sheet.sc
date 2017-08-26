val regexStr="([\"'])(?:(?=(\\\\?))\\2.)*?\\1".r
var str: String="32281,Kimi no Na wa.,\"Drama ,Romance\",Movie,1,9.37,200630"
val fstr=str.replaceAll("([\"'])(?:(?=(\\\\?))\\2.)*?\\1","")
val t=regexStr.findAllIn(str)
val w=t.toArray
w(1)
