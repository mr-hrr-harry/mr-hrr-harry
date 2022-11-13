// Wanna kno me ? But before that, if you kno u kno...get ready with a java compiler

public class Hello{
  public static void main(String[] args){
    String[] chat = new String[20];
    String You, Horror;
    chat[0] = "Hello Man";
    chat[1] = "Hello dood";
    chat[3] = "What's your name ?";
    chat[4] = "I'm Maria Antony Harish J. But u can call me harry ... horror harry, that will do";
    chat[5] = "Where are you from ?";
    chat[6] = "I'm from Thoothukudi, TamilNadu, India, a less known town on earth";
    chat[7] = "What are you good at ?";
    chat[8] = "I'm good at java problem programming, efficient time and space complex code solver. pattern handling";
    chat[9] = "Say more about yourself";
    chat[10] = "I've the traits of a learner - an enthusiastic learner, critical thinker, good decision maker, efficient mini problem program solver, a man of colorful view, creative thinker, a good writer of quotes/poem and this list extends further";
    chat[11] = "That's good. Lemme kno ur hobbies or timepass";
    chat[12] = "I always 've a never ending or never dying love for Space, Music, Colors, Numbers";
    chat[13] = "Say about your technical side";
    chat[14] = "Hahaha, I aint a good resume builder ... still let my resume speak Open Browser >> copy this url >> \"https://www.linkedin.com/in/m-a-harish-j-a69474209 \" ";
    chat[15] = "Good and nice to meet you man, how could I contact you ?";
    chat[16] = "Connect me thro your linkedIn and just text your one of your gitHub profile viewer and there I'm your new friend";
    char[17] = "u r Crazy man";
    char[18] = "I'm always crazy my man";
    
    for(int i=0; i<chat.length; i++){
      if(i%2==0){
        System.out.println("You "+ chat[i]);
      }
      else{
        System.out.println("Horror "+ chat[i] + "\n");
      }
    } 
  }
}
