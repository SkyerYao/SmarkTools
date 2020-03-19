import java.util.regex.Matcher;
import java.util.regex.Pattern;

public static void main(String[] args){
    /*需要分割的文章*/  
    String text = "第一句。第二句！第三句：第四句；第五句。";
    String[] sentences = splitTextWithPunctuations(text);
    /*输出结果*/  
    for(int index = 0; index < sentences.length; index++)  
    {  
        String sentence = sentences[index];  
        System.out.println("sentence = " + sentence);  
    }
}

public String[] splitTextWithPunctuations(String text){
    /*正则表达式：句子结束符*/  
    String regEx="：|。|！|；";   
    Pattern p =Pattern.compile(regEx);  
    Matcher m = p.matcher(text);  
      
    /*按照句子结束符分割句子*/  
    String[] sentences = p.split(text);  
      
    /*将句子结束符连接到相应的句子后*/  
    if(sentences.length > 0)  
    {  
        int count = 0;  
        while(count < sentences.length)  
        {  
            if(m.find())  
            {  
                sentences[count] += m.group();  
            }  
            count++;  
        }  
    }
}
