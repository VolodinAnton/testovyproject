package com.company.differents;

public enum Countryes {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        OTHER("Other");

        private String name;

        private Countryes(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return this.name;
        }
}

