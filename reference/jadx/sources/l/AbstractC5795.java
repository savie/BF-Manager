package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ۚܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H6PC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5795 extends AbstractC14709 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Map f19896;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19897;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ArrayDeque f19898;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f19899;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f19900;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f19901;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 f19902;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayDeque f19903;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f19904;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f19905;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f19906;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f19907;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f19908;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f19909;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f19910;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayDeque f19911;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC8743 f19912;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f19913;

    static {
        HashMap map = new HashMap();
        map.put("f'", 1);
        map.put("rf'", 3);
        C11958.m29934(map, "fr'", (Integer) 3, 5, "f\"");
        map.put("rf\"", 7);
        map.put("fr\"", 7);
        map.put("f'''", 9);
        map.put("rf'''", 11);
        C11958.m29934(map, "fr'''", (Integer) 11, 13, "f\"\"\"");
        map.put("rf\"\"\"", 15);
        map.put("fr\"\"\"", 15);
        map.put("t'", 2);
        map.put("rt'", 4);
        C11958.m29934(map, "tr'", (Integer) 4, 6, "t\"");
        map.put("rt\"", 8);
        map.put("tr\"", 8);
        map.put("t'''", 10);
        map.put("rt'''", 12);
        C11958.m29934(map, "tr'''", (Integer) 12, 14, "t\"\"\"");
        map.put("rt\"\"\"", 16);
        map.put("tr\"\"\"", 16);
        f19896 = C4681.unmodifiableMap(map);
    }

    public AbstractC5795(InterfaceC17693 interfaceC17693) {
        super(interfaceC17693);
        this.f19913 = "";
        this.f19908 = new ArrayDeque();
        this.f19898 = new ArrayDeque();
        this.f19905 = 0;
        this.f19897 = 0;
        this.f19910 = 0;
        this.f19906 = new ArrayDeque();
        this.f19911 = new ArrayDeque();
        this.f19909 = "";
        this.f19900 = 0;
        this.f19907 = 0;
        this.f19903 = new ArrayDeque();
        this.f19899 = false;
        this.f19904 = false;
        this.f19901 = false;
        this.f19902 = null;
        this.f19912 = null;
    }

    @Override // l.AbstractC14709, l.InterfaceC13963
    public final InterfaceC8743 nextToken() {
        int i = this.f19905;
        ArrayDeque arrayDeque = this.f19898;
        if (i != -1) {
            m16897();
            ArrayDeque arrayDeque2 = this.f19908;
            if (arrayDeque2.isEmpty()) {
                arrayDeque2.push(0);
                if (this.f19902.getType() == 11) {
                    m16897();
                }
                String str = this.f19913;
                if (!str.isEmpty()) {
                    C16201 c16201 = new C16201(this.f48065, 1, 1, 0, 0);
                    c16201.m38427(str);
                    c16201.m38428(0);
                    c16201.m38432(-1);
                    m16901(c16201);
                }
                while (this.f19902.getType() != -1) {
                    if (this.f19902.mo23441() == 0) {
                        if (this.f19902.getType() != 102) {
                            if (this.f19905 != 104 || m16906(((InterfaceC8743) arrayDeque.peekLast()).getText()) == 0) {
                                break;
                                break;
                            }
                            m16903("first statement indented");
                            m16899(2, " ERROR: first statement indented", this.f19902);
                            break;
                        }
                        C16201 c16202 = new C16201(this.f19902);
                        c16202.m38426(1);
                        m16901(c16202);
                    } else {
                        m16901(this.f19902);
                    }
                    m16897();
                }
            }
            int type = this.f19902.getType();
            ArrayDeque arrayDeque3 = this.f19903;
            if (type == -1) {
                int i2 = this.f19897;
                if (i2 > 0) {
                    if (i2 != 3 && i2 != 102) {
                        m16899(IShizukuService.Stub.TRANSACTION_attachUserService, (String) null, this.f19912);
                    }
                    m16902(0);
                }
                m16901(this.f19902);
            } else if (type == 6 || type == 9) {
                String text = this.f19902.getText();
                if (text.length() >= 2) {
                    text = text.substring(text.length() - 2);
                }
                text.getClass();
                if (text.equals("{{")) {
                    m16907(14, 1, "{");
                } else if (text.equals("}}")) {
                    m16907(17, 1, l.d);
                }
                m16901(this.f19902);
            } else if (type == 58) {
                if (!arrayDeque3.isEmpty() && ((Integer) this.f19906.peek()).intValue() == 0) {
                    C16201 c16203 = new C16201(this.f19902);
                    c16203.m38429(19);
                    c16203.m38427(":");
                    c16203.m38431(c16203.mo23442());
                    this.f19902 = c16203;
                    int type2 = this.f19912.getType();
                    if (type2 == 6 || type2 == 9) {
                        C16201 c16204 = new C16201(this.f19912);
                        c16204.m38427("=" + c16204.getText());
                        c16204.m38433(c16204.mo23442() - 1);
                        c16204.m38432(c16204.mo23437() - 1);
                        this.f19912 = c16204;
                    } else {
                        m16901(this.f19902);
                        m16898(this.f19900, 0, "=");
                    }
                }
                m16901(this.f19902);
            } else if (type != 102) {
                if (type != 106) {
                    switch (type) {
                        case 12:
                        case 13:
                        case 14:
                            this.f19910++;
                            m16901(this.f19902);
                            break;
                        case 15:
                        case 16:
                        case 17:
                            this.f19910--;
                            m16901(this.f19902);
                            break;
                        default:
                            m16901(this.f19902);
                            break;
                    }
                } else {
                    m16903("token recognition error at: '" + this.f19902.getText() + "'");
                    m16901(this.f19902);
                }
            } else if (!arrayDeque3.isEmpty()) {
                m16901(this.f19902);
            } else if (this.f19910 <= 0) {
                InterfaceC8743 c16205 = new C16201(this.f19902);
                boolean z = this.f19912.getType() == 104;
                if (z) {
                    m16897();
                }
                int type3 = this.f19912.getType();
                if (type3 != 102 && type3 != 103) {
                    m16901(c16205);
                    if (z) {
                        int iM16906 = this.f19912.getType() == -1 ? 0 : m16906(this.f19902.getText());
                        if (iM16906 != -1) {
                            m16901(this.f19902);
                            m16902(iM16906);
                        } else {
                            m16903("inconsistent use of tabs and spaces in indentation");
                            m16899(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent use of tabs and spaces in indentation"), this.f19912);
                        }
                    } else {
                        m16902(0);
                    }
                } else {
                    C16201 c16206 = new C16201(c16205);
                    c16206.m38426(1);
                    m16901(c16206);
                    if (z) {
                        m16901(this.f19902);
                    }
                }
            } else {
                C16201 c16207 = new C16201(this.f19902);
                c16207.m38426(1);
                m16901(c16207);
            }
            if (!arrayDeque3.isEmpty() && this.f19912.getType() == 17) {
                int type4 = this.f19902.getType();
                if (type4 == 17) {
                    String str2 = this.f19909;
                    C5049 c5049 = ((C8755) this).f28466;
                    C8755 c8755 = new C8755(new C22203(new C16947(str2, new RunnableC9500(c5049)), c5049), c5049);
                    c8755.m24869();
                    C7264 c7264 = new C7264(c8755, c5049);
                    C13975 c13975 = new C13975(c7264, c5049);
                    c13975.m24869();
                    c13975.m32265();
                    if (c13975.m2508() != 0) {
                        c7264.mo11530(0);
                        C13975 c13976 = new C13975(c7264, c5049);
                        c13976.m24869();
                        c13976.m32224();
                        if (c13976.m2508() != 0) {
                            m16899(this.f19900, "", this.f19912);
                        }
                    }
                } else if (type4 == 19) {
                    m16899(this.f19900, "", this.f19912);
                }
            }
        }
        return (InterfaceC8743) arrayDeque.pollFirst();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m16908(int i) {
        this.f48054.m54929(this.f48055);
        this.f48055 = i;
        this.f19903.push(Integer.valueOf(this.f19907));
        this.f19907 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:0x0169  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x019f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m16897() {
        InterfaceC8743 interfaceC8743NextToken;
        int type;
        ArrayDeque arrayDeque;
        InterfaceC8743 interfaceC8743NextToken2 = this.f19912;
        if (interfaceC8743NextToken2 == null) {
            interfaceC8743NextToken2 = super.nextToken();
        }
        this.f19902 = interfaceC8743NextToken2;
        int type2 = interfaceC8743NextToken2.getType();
        ArrayDeque arrayDeque2 = this.f19903;
        if (type2 != -1) {
            if (type2 != 106) {
                switch (type2) {
                    case 5:
                        this.f19900 = 6;
                        m16905();
                        break;
                    case 6:
                    case 9:
                        String text = this.f19902.getText();
                        if (text.length() >= 2) {
                            text = text.substring(text.length() - 2);
                        }
                        text.getClass();
                        switch (text) {
                            case ""{":
                            case "'{":
                            case "\{":
                                m16907(14, 0, "{");
                                break;
                        }
                        int type3 = this.f19902.getType();
                        if (type3 != 6 && type3 != 9) {
                            type = this.f19902.getType();
                            arrayDeque = this.f19906;
                            if (type == 19 && type != 58) {
                                if (type == 102) {
                                    m16900(this.f19902.getText());
                                    C16201 c16201 = new C16201(this.f19902);
                                    c16201.m38426(1);
                                    this.f19902 = c16201;
                                    break;
                                } else {
                                    switch (type) {
                                        case 12:
                                        case 13:
                                            m16900(this.f19902.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() + 1));
                                            break;
                                        case 14:
                                            this.f19911.push("{");
                                            arrayDeque.push(0);
                                            m16908(0);
                                            break;
                                        case 15:
                                        case 16:
                                            m16900(this.f19902.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() - 1));
                                            break;
                                        case 17:
                                            int i = this.f19907;
                                            if (i == 0) {
                                                m16909();
                                                m16904();
                                                break;
                                            } else {
                                                switch (i) {
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                        m16909();
                                                        m16909();
                                                        m16904();
                                                        break;
                                                    default:
                                                        m16903("f-string: single '}' is not allowed");
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            m16900(this.f19902.getText());
                                            break;
                                    }
                                }
                            } else {
                                m16900(this.f19902.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m16908(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m16908(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m16908(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m16908(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m16908(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m16908(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m16908(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m16908(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m16908(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m16908(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m16908(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m16908(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m16908(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m16908(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m16908(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m16908(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 7:
                    case 10:
                        m16909();
                        break;
                    case 8:
                        this.f19900 = 9;
                        m16905();
                        break;
                    default:
                        if (!arrayDeque2.isEmpty()) {
                            type = this.f19902.getType();
                            arrayDeque = this.f19906;
                            if (type == 19) {
                                m16900(this.f19902.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m16908(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m16908(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m16908(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m16908(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m16908(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m16908(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m16908(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m16908(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m16908(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m16908(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m16908(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m16908(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m16908(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m16908(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m16908(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m16908(32);
                                            break;
                                    }
                                }
                            } else {
                                m16900(this.f19902.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m16908(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m16908(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m16908(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m16908(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m16908(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m16908(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m16908(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m16908(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m16908(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m16908(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m16908(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m16908(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m16908(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m16908(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m16908(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m16908(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        } else if (!arrayDeque2.isEmpty()) {
            m16903("unterminated interpolated string literal");
        }
        if (this.f19902.getType() == -1) {
            interfaceC8743NextToken = this.f19902;
        } else {
            interfaceC8743NextToken = super.nextToken();
        }
        this.f19912 = interfaceC8743NextToken;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m16902(int i) {
        int iIntValue = ((Integer) this.f19908.peek()).intValue();
        if (i > iIntValue) {
            m16899(2, (String) null, this.f19912);
            this.f19908.push(Integer.valueOf(i));
            return;
        }
        while (i < iIntValue) {
            this.f19908.pop();
            iIntValue = ((Integer) this.f19908.peek()).intValue();
            if (i <= iIntValue) {
                m16899(3, (String) null, this.f19912);
            } else {
                m16903("inconsistent dedent");
                m16899(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent dedent"), this.f19912);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m16906(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '\t') {
                this.f19904 = true;
                i += 8 - (i % 8);
            } else if (c == '\f') {
                i = 0;
            } else if (c == ' ') {
                this.f19899 = true;
                i++;
            }
        }
        if (!this.f19904 || !this.f19899 || this.f19901) {
            return i;
        }
        this.f19901 = true;
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16900(String str) {
        this.f19911.push(((String) this.f19911.pop()) + str);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m16905() {
        Integer num = (Integer) f19896.get(this.f19902.getText().toLowerCase());
        if (num != null) {
            m16908(num.intValue());
            return;
        }
        m16903("internal error: unknown interpolated string literal prefix: " + this.f19902.getText());
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m16904() {
        this.f19906.pop();
        this.f19909 = C14483.m34972((String) this.f19911.pop(), l.d);
        if (this.f19911.isEmpty()) {
            return;
        }
        StringBuilder sbM27333 = C10732.m27333((String) this.f19911.pop());
        sbM27333.append(this.f19909);
        this.f19911.push(sbM27333.toString());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m16907(int i, int i2, String str) {
        String strM5124 = C1402.m5124(1, 0, this.f19902.getText());
        C16201 c16201 = new C16201(this.f19902);
        c16201.m38427(strM5124);
        c16201.m38431(c16201.mo23440() - 1);
        m16901(c16201);
        m16898(i, i2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16898(int i, int i2, String str) {
        C16201 c16201 = new C16201(this.f19902);
        c16201.m38429(i);
        c16201.m38427(str);
        c16201.m38426(i2);
        c16201.m38432(c16201.mo23437() + 1);
        c16201.m38433(c16201.mo23442() + 1);
        c16201.m38431(c16201.mo23442());
        this.f19902 = c16201;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m16909() {
        m35380();
        this.f19907 = ((Integer) this.f19903.pop()).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16899(int i, String str, InterfaceC8743 interfaceC8743) {
        C16201 c16201 = new C16201(interfaceC8743);
        c16201.m38429(i);
        c16201.m38426(0);
        c16201.m38431(interfaceC8743.mo23442() - 1);
        if (str == null) {
            str = "<" + C13252.f42344.m50199(i) + ">";
        }
        c16201.m38427(str);
        m16901(c16201);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m16901(InterfaceC8743 interfaceC8743) {
        this.f19905 = interfaceC8743.getType();
        if (interfaceC8743.mo23441() == 0) {
            this.f19897 = this.f19905;
        }
        this.f19898.addLast(interfaceC8743);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m16903(String str) {
        m24873().mo2202(this, Integer.valueOf(this.f19902.getType()), this.f19902.getLine(), this.f19902.mo23437(), C25272.m56409(" LEXER ERROR: ", str), (C10234) null);
    }
}
