import java.util.*;

public class labeg {
    public void leadingCharacterSame()
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            String s1,s2;
            s1=sc.nextLine();
            s2=sc.nextLine();
            int len=s1.length()<s2.length()?s1.length():s2.length();
            int c=0;
            for(int j=0;j<len;j++)
            {
                if(s1.charAt(j)==s2.charAt(j))
                    c++;
                else break;
            }
            System.out.println(c);
        }
    }
    public void minWindow(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        int[] map = new int[256];
        int end = 0;
        int start = 0;
        int min_length = Integer.MAX_VALUE;
        for(int i = 0; i < t_array.length; i++) // store t character and its count ----< means the lack number
            map[t_array[i]] ++;
        int count = t_array.length;
        int min_start = 0;

        // for those Characters t doesn't have, map[thisCharacter] are at most 0
        while(end < s_array.length)
        {
            if(map[s_array[end]] > 0)   // t has this character
            {
                count--;
            }
            map[s_array[end]] --;
            while(count == 0)   //window matches
            {
                if((end - start + 1) < min_length)
                {
                    min_length = end - start + 1;
                    min_start = start;
                }
                map[s_array[start]] ++;     // start go left
                if(map[s_array[start]] > 0){    // remove a character which t has
                    count ++;           //Cause for those Characters t doesn't have, map[thisCharacter] are at most 0
                }
                start++;
            }
            end ++;

        }
        if( min_start+min_length > s_array.length)
            System.out.println("");
        System.out.println(s.substring(min_start, min_start+min_length));
    }
    public void pairedIsogram()
    {
        Scanner s=new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++)
        {
            String s1=s.nextLine();
            int[] a=new int[123];
            for(int j=0;j<s1.length();j++)
            {
                char ch=s1.charAt(j);
                int a1=ch;
                a[a1]++;

            }
            StringBuilder s2=new StringBuilder();
            StringBuilder s3=new StringBuilder();
            int flag=1;
            for(int j=0;j<123;j++)
            {
                String ch= String.valueOf((char) j);
                if(a[j]==1)
                {
                    s2.append(ch+" ");
                    flag=0;
                }
                else
                {
                    if(a[j]==2)
                        s3.append(ch+" ");
                }
            }
            if(flag==0)
            {
                System.out.println(s2+"no");
            }
            else
            {
                System.out.println(s3+"yes");
            }

        }
    }
    public void nGram()
    {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int p = Integer.parseInt(sc.nextLine());
        List<String> inputs = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            inputs.add(sc.nextLine());
        }
        int ngram = Integer.parseInt(sc.nextLine());
        System.out.println(inputs);
        for (String str : inputs) {
            if (ngram == 1 && str.length() >= 1) {
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.toString(str.charAt(i)).equals(".") && !Character.toString(str.charAt(i)).equals(",")
                            && !Character.toString(str.charAt(i)).equals(" ")) {
                        if (map.containsKey(Character.toString(str.charAt(i)))) {
                            int a = map.get(Character.toString(str.charAt(i)));
                            map.put(Character.toString(str.charAt(i)), a + 1);
                        } else {
                            map.put(Character.toString(str.charAt(i)), 1);
                        }
                    }
                }
            } else if (ngram == 2 && str.length() >= 2) {
                for (int i = 0; i < str.length() - 1; i++) {
                    if (!Character.toString(str.charAt(i)).equals(".") && !Character.toString(str.charAt(i)).equals(",")
                            && !Character.toString(str.charAt(i)).equals(" ")) {
                        String s = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1));
                        if (map.containsKey(s)) {
                            int a = map.get(s);
                            map.put(s, a + 1);
                        } else {
                            map.put(s, 1);
                        }
                    }
                }
            } else if (ngram == 3 && str.length() >= 3) {
                for (int i = 0; i < str.length() - 2; i++) {
                    if (!Character.toString(str.charAt(i)).equals(".") && !Character.toString(str.charAt(i)).equals(",")
                            && !Character.toString(str.charAt(i)).equals(" ")) {
                        String s = Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1))
                                + Character.toString(str.charAt(i + 2));
                        if (map.containsKey(s)) {
                            int a = map.get(s);
                            map.put(s, a + 1);
                        } else {
                            map.put(s, 1);
                        }
                    }
                }
            }
        }
        Map.Entry<String, Integer> maxEntry = null;
        //maxEntry = map.entrySet().iterator().next();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        String answerString = maxEntry.getKey();
        System.out.println(maxEntry);
        System.out.println(answerString);
        if (ngram == 1) {
            System.out.println("Unigram" + " " + answerString);
        } else if (ngram == 2) {
            System.out.println("Bigram" + " " + answerString);
        } else if (ngram == 3) {
            System.out.println("Trigram" + " " + answerString);
        }
        sc.close();
    }
    public static void main(String[] args) {

    }
    public String sortSentence(String s) {
        String[] s1=s.split(" ");
        String[] s2=new String[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            int index=Integer.parseInt(String.valueOf(s1[i].charAt(s1[i].length()-1)));
            String t=s1[i].substring(0,s1[i].length()-1);
            s2[index]=t;
        }
        return String.join(" ",s2);
    }

    public String[] sortPeople(String[] strings, int[] ints) {

        String[] sorted=new String[100001];
        String[] ans=new String[strings.length];

        for(int i=0;i<strings.length;i++)
            sorted[ints[i]]=strings[i];

        int j=0;

        for(int i=0;i<100000;i++)
            if(sorted[i]!=null)
                ans[j++]=sorted[i];
        Collections.reverse(Arrays.asList(ans));

        return ans;
    }
    public String replaceDigits(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(i%2!=0)
            {
                char ch= (char) (s.charAt(i-1)+Integer.parseInt(String.valueOf(s.charAt(i))));
            }
            else
                ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) break; // Since arr[i] <= arr[l] <= arr[r], if a[i] > 0 then sum=arr[i]+arr[l]+arr[r] > 0
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum < 0) l++;
                else if (sum > 0) r--;
                else {
                    ans.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    while (l+1 <= r && arr[l] == arr[l+1]) l++; // Skip duplicate nums[l]
                    l++;
                    r--;
                }
            }
            while (i+1 < n && arr[i+1] == arr[i]) i++; // Skip duplicate nums[i]
        }
        return ans;
    }
    public void trangle()
    {
        /*
        int n, f;
        int a[10], b[10], c[10];
        cin» a[0]» a[1]» a[2];
        cin» b[0]» b[1]» b[2];
        sort(a, a + 3);
        sort(b, b + 3);
        int k = 0;
        for (int i = 0; i < 3; i++) {
          if (a[i] == b[i]) k++;
        }
        if (a[0] * a[0] + a[1] * a[1] == a[2] * a[2] && k == 3) cout« "YES"«
        endl;
        else cout << "NO" << endl;
        return 0;
         */
    }
}
