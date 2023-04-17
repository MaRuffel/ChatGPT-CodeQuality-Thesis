package de.rueffreck.smellsamples.complexity;

public class Complexity3 {

    public int compute(int a) {
        if(a == 1) {
            return 234;
        } else if(a == 2) {
            return 543;
        } else if(a == 3) {
            return 23;
        } else if(a == 4) {
            return 567;
        } else if(a == 6) {
            return 121;
        } else if(a == 7) {
            return 32;
        } else if(a == 8) {
            return 42;
        } else if(a == 9) {
            return 2321;
        } else if(a == 10) {
            return 2321;
        } else if(a == 11) {
            return 750;
        } else if(a == 12) {
            return 765;
        } else if(a == 13) {
            return 345;
        } else if(a == 14) {
            return 2321;
        } else if(a == 15) {
            return 2321;
        } else if(a == 16) {
            return 2321;
        } else if(a == 17) {
            return 5445;
        } else {
            return 0;
        }
    }

    public int computeSeparated(int a) {
        if(a == 1) {
            return 234;
        }
        if(a == 2) {
            return 543;
        }
        if(a == 3) {
            return 23;
        }
        if(a == 4) {
            return 567;
        }
        if(a == 6) {
            return 121;
        }
        if(a == 7) {
            return 32;
        }
        if(a == 8) {
            return 42;
        }
        if(a == 9) {
            return 2321;
        }
        if(a == 10) {
            return 2321;
        }
        if(a == 11) {
            return 750;
        }
        if(a == 12) {
            return 765;
        }
        if(a == 13) {
            return 345;
        }
        if(a == 14) {
            return 2321;
        }
        if(a == 15) {
            return 2321;
        }
        if(a == 16) {
            return 2321;
        }
        if(a == 17) {
            return 5445;
        } else {
            return 0;
        }
    }

    public int computeExtra(int a) {
        if(a == 1) {
            return 234;
        } else {
            if(a == 2) {
                return 543;
            } else {
                if(a == 3) {
                    return 23;
                } else {
                    if(a == 4) {
                        return 567;
                    } else {
                        if(a == 6) {
                            return 121;
                        } else {
                            if(a == 7) {
                                return 32;
                            } else {
                                if(a == 8) {
                                    return 42;
                                } else {
                                    if(a == 9) {
                                        return 2321;
                                    } else {
                                        if(a == 10) {
                                            return 2321;
                                        } else {
                                            if(a == 11) {
                                                return 750;
                                            } else {
                                                if(a == 12) {
                                                    return 765;
                                                } else {
                                                    if(a == 13) {
                                                        return 345;
                                                    } else {
                                                        if(a == 14) {
                                                            return 2321;
                                                        } else {
                                                            if(a == 15) {
                                                                return 2321;
                                                            } else {
                                                                if(a == 16) {
                                                                    return 2321;
                                                                } else {
                                                                    if(a == 17) {
                                                                        return 5445;
                                                                    } else {
                                                                        return 0;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
