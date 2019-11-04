package microservice.springcloug.lab7wordserver.domain;

public class Word
{
    private String word;

    public Word()
    {
        super();
        this.word = null;
    }

    public Word(String word)
    {
        super();
        this.word = word;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    @Override
    public String toString()
    {
        return word;
    }
}
