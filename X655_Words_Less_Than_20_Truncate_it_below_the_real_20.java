    String fullWords(String s)
            {
            int n = s.length();
            if(s ==null || s.startsWith("")){
                return s;
            }
            if (n == 0){
            return s;
            }
            if(n<=20){
            return s;
            }
            else{
            int spaceLocation = 0;
            for(int i=0; i<20; i++){
            if(s.charAt(i)==' '){
            spaceLocation = i;
            }

            }
            if(spaceLocation==0){
            return s.substring(0, 20);
            }
            return s.substring(0, spaceLocation);
            }
            }
