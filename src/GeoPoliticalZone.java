public enum GeoPoliticalZone {
    NORTH_CENTRAL(new String[]{"Benue", "Fct", "Kogi", "Nasara", "kawara", "plateau"}),
    NORTH_EAST(new String[]{"ADAMAWA", "BAUCHI", "BORNO", "GOMBE", "TARABA", "Yobe"}),
    NORTH_WEST(new String[]{"kaduna", "kastina", "kano", "kebbi", "sokoto", "jigawa", "zamfara"}),
    SOUTH_EAST(new String[]{"ABIA", "ANAMBRA", "EBONYI", "ENUGU", "IMO"}),
    SOUTH_SOUTH(new String[]{"AKWA_IBOM", "BAYELSA", "CROSS_RIVER", "DELTA"}),
    SOUTH_WEST(new String[]{"EKITI", "LAGOS", "OSUN", "ONDO", "OGUN", "OYO"});

    private String[] state;


        GeoPoliticalZone(String[] state) {
        this.state = state;
        }

    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;
    }

    public static GeoPoliticalZone zones(String state){
            for (GeoPoliticalZone zone : GeoPoliticalZone.values()){
                for (String value : zone.getState()){
                    if (value.equalsIgnoreCase(state)){
                        return zone;
                    }
                }
            }
            return null;

    }


    }





