import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareNumberTest{

    private CompareNumber compareNumber = new CompareNumber();

    @Test
    public void shouldReturn4A0BWhenAnswerIs1234AndInputIs1234(){
        String result = compareNumber.compare("1234","1234");
        assertThat(result,is("4A0B"));
    }

    @Test
    public void shouldReturn3A0BWhenAnswerIs1234AndInputIs1235(){
        String result = compareNumber.compare("1234","1235");
        assertThat(result,is("3A0B"));
    }

    @Test
    public void shouldReturn2A2BWhenAnswerIs1234AndInputIs1243(){
        String result = compareNumber.compare("1234","1243");
        assertThat(result,is("2A2B"));
    }

    @Test
    public void shouldReturn2A1BWhenAnswerIs1234AndInputIs1245(){
        String result = compareNumber.compare("1234","1245");
        assertThat(result,is("2A1B"));
    }

    @Test
    public void shouldReturn2A0BWhenAnswerIs1234AndInputIs1256(){
        String result = compareNumber.compare("1234","1256");
        assertThat(result,is("2A0B"));
    }

    @Test
    public void shouldReturn1A3BWhenAnswerIs1234AndInputIs1423(){
        String result = compareNumber.compare("1234","1423");
        assertThat(result,is("1A3B"));
    }

    @Test
    public void shouldReturn1A2BWhenAnswerIs1234AndInputIs1425(){
        String result = compareNumber.compare("1234","1425");
        assertThat(result,is("1A2B"));
    }

    @Test
    public void shouldReturn1A1BWhenAnswerIs1234AndInputIs1456(){
        String result = compareNumber.compare("1234","1456");
        assertThat(result,is("1A1B"));
    }

    @Test
    public void shouldReturn1A0BWhenAnswerIs1234AndInputIs1567(){
        String result = compareNumber.compare("1234","1567");
        assertThat(result,is("1A0B"));
    }

    @Test
    public void shouldReturn0A0BWhenAnswerIs1234AndInputIs5678(){
        String result = compareNumber.compare("1234","5678");
        assertThat(result,is("0A0B"));
    }

    @Test
    public void shouldReturn0A4BWhenAnswerIs1234AndInputIs4321(){
        String result = compareNumber.compare("1234","4321");
        assertThat(result,is("0A4B"));
    }

    @Test
    public void shouldReturn0A3BWhenAnswerIs1234AndInputIs4325(){
        String result = compareNumber.compare("1234","4325");
        assertThat(result,is("0A3B"));
    }

    @Test
    public void shouldReturn0A2BWhenAnswerIs1234AndInputIs4356(){
        String result = compareNumber.compare("1234","4356");
        assertThat(result,is("0A2B"));
    }

    @Test
    public void shouldReturn0A1BWhenAnswerIs1234AndInputIs4567(){
        String result = compareNumber.compare("1234","4567");
        assertThat(result,is("0A1B"));
    }
}
