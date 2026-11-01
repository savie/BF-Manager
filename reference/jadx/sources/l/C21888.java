package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: l.᩸᩺۟, reason: contains not printable characters */
/* JADX INFO: compiled from: P43R */
/* JADX INFO: loaded from: classes4.dex */
public final class C21888 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f71007;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Reader f71008;

    public C21888(BufferedReader bufferedReader) {
        this.f71008 = bufferedReader;
        this.f71007 = bufferedReader.read();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48683() throws IOException {
        int i;
        Reader reader;
        while (true) {
            i = this.f71007;
            reader = this.f71008;
            if (i == -1) {
                break;
            }
            if (i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
                if (i != 35) {
                    break;
                }
                this.f71007 = reader.read();
                while (true) {
                    int i2 = this.f71007;
                    if (i2 == 10 || i2 == 13 || i2 == -1) {
                        break;
                    }
                    this.f71007 = reader.read();
                }
            }
            this.f71007 = reader.read();
        }
        if (i == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char c = 0;
        while (true) {
            int i3 = this.f71007;
            if (i3 == -1) {
                return sb.toString();
            }
            if (i3 != 9) {
                if (i3 != 10) {
                    if (i3 != 12) {
                        if (i3 != 13) {
                            if (i3 != 32) {
                                if (i3 == 34 || i3 == 39) {
                                    if (c == 0) {
                                        c = (char) i3;
                                    } else if (c == i3) {
                                        c = 0;
                                    } else {
                                        sb.append((char) i3);
                                    }
                                    this.f71007 = reader.read();
                                } else {
                                    if (i3 == 92) {
                                        if (c != 0) {
                                            int i4 = reader.read();
                                            this.f71007 = i4;
                                            if (i4 == 10 || i4 == 13) {
                                                while (true) {
                                                    int i5 = this.f71007;
                                                    if (i5 == 32 || i5 == 10 || i5 == 13 || i5 == 9 || i5 == 12) {
                                                        this.f71007 = reader.read();
                                                    }
                                                }
                                            } else if (i4 == 102) {
                                                this.f71007 = 12;
                                            } else if (i4 == 110) {
                                                this.f71007 = 10;
                                            } else if (i4 == 114) {
                                                this.f71007 = 13;
                                            } else if (i4 == 116) {
                                                this.f71007 = 9;
                                            }
                                        }
                                        sb.append((char) this.f71007);
                                    } else {
                                        sb.append((char) i3);
                                    }
                                    this.f71007 = reader.read();
                                }
                            }
                        }
                    }
                }
                return sb.toString();
            }
            if (c == 0) {
                return sb.toString();
            }
            sb.append((char) i3);
            this.f71007 = reader.read();
        }
    }
}
