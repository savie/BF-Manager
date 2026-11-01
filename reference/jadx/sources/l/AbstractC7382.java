package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۟ۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6PC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7382 extends AbstractC1415 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Map f24489;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f24490;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f24491;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f24492;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f24493;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f24494;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f24495;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 f24496;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f24497;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayDeque f24498;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24499;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f24500;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24501;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24502;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayDeque f24503;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC19761 f24504;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f24505;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f24506;

    static {
        HashMap map = new HashMap();
        map.put("f'", 1);
        map.put("rf'", 3);
        C15037.m36025(map, "fr'", 3, 5, "f\"");
        map.put("rf\"", 7);
        map.put("fr\"", 7);
        map.put("f'''", 9);
        map.put("rf'''", 11);
        C15037.m36025(map, "fr'''", 11, 13, "f\"\"\"");
        map.put("rf\"\"\"", 15);
        map.put("fr\"\"\"", 15);
        map.put("t'", 2);
        map.put("rt'", 4);
        C15037.m36025(map, "tr'", 4, 6, "t\"");
        map.put("rt\"", 8);
        map.put("tr\"", 8);
        map.put("t'''", 10);
        map.put("rt'''", 12);
        C15037.m36025(map, "tr'''", 12, 14, "t\"\"\"");
        map.put("rt\"\"\"", 16);
        map.put("tr\"\"\"", 16);
        f24489 = C0561.unmodifiableMap(map);
    }

    public AbstractC7382(InterfaceC1623 interfaceC1623) {
        super(interfaceC1623);
        this.f24493 = "";
        this.f24500 = new ArrayDeque();
        this.f24497 = new ArrayDeque();
        this.f24506 = 0;
        this.f24501 = 0;
        this.f24502 = 0;
        this.f24492 = new ArrayDeque();
        this.f24503 = new ArrayDeque();
        this.f24490 = "";
        this.f24494 = 0;
        this.f24495 = 0;
        this.f24498 = new ArrayDeque();
        this.f24499 = false;
        this.f24491 = false;
        this.f24505 = false;
        this.f24496 = null;
        this.f24504 = null;
    }

    @Override // l.AbstractC1415, l.InterfaceC10589
    public final InterfaceC19761 nextToken() {
        int i = this.f24506;
        ArrayDeque arrayDeque = this.f24497;
        if (i != -1) {
            m19662();
            ArrayDeque arrayDeque2 = this.f24500;
            if (arrayDeque2.isEmpty()) {
                arrayDeque2.push(0);
                if (this.f24496.getType() == 11) {
                    m19662();
                }
                String str = this.f24493;
                if (!str.isEmpty()) {
                    C9386 c9386 = new C9386(this.f5853, 1, 1, 0, 0);
                    c9386.m24075(str);
                    c9386.m24077(0);
                    c9386.m24078(-1);
                    m19661(c9386);
                }
                while (this.f24496.getType() != -1) {
                    if (this.f24496.mo22512() == 0) {
                        if (this.f24496.getType() != 102) {
                            if (this.f24506 != 104 || m19665(((InterfaceC19761) arrayDeque.peekLast()).getText()) == 0) {
                                break;
                                break;
                            }
                            m19664("first statement indented");
                            m19659(2, " ERROR: first statement indented", this.f24496);
                            break;
                        }
                        C9386 c9387 = new C9386(this.f24496);
                        c9387.m24074(1);
                        m19661(c9387);
                    } else {
                        m19661(this.f24496);
                    }
                    m19662();
                }
            }
            int type = this.f24496.getType();
            ArrayDeque arrayDeque3 = this.f24498;
            if (type == -1) {
                int i2 = this.f24501;
                if (i2 > 0) {
                    if (i2 != 3 && i2 != 102) {
                        m19659(IShizukuService.Stub.TRANSACTION_attachUserService, (String) null, this.f24504);
                    }
                    m19663(0);
                }
                m19661(this.f24496);
            } else if (type == 6 || type == 9) {
                String text = this.f24496.getText();
                if (text.length() >= 2) {
                    text = text.substring(text.length() - 2);
                }
                text.getClass();
                if (text.equals("{{")) {
                    m19666(14, 1, "{");
                } else if (text.equals("}}")) {
                    m19666(17, 1, l.d);
                }
                m19661(this.f24496);
            } else if (type == 58) {
                if (!arrayDeque3.isEmpty() && ((Integer) this.f24492.peek()).intValue() == 0) {
                    C9386 c9388 = new C9386(this.f24496);
                    c9388.m24072(19);
                    c9388.m24075(":");
                    c9388.m24076(c9388.mo22508());
                    this.f24496 = c9388;
                    int type2 = this.f24504.getType();
                    if (type2 == 6 || type2 == 9) {
                        C9386 c9389 = new C9386(this.f24504);
                        c9389.m24075("=" + c9389.getText());
                        c9389.m24073(c9389.mo22508() - 1);
                        c9389.m24078(c9389.mo22509() - 1);
                        this.f24504 = c9389;
                    } else {
                        m19661(this.f24496);
                        m19658(this.f24494, 0, "=");
                    }
                }
                m19661(this.f24496);
            } else if (type != 102) {
                if (type != 106) {
                    switch (type) {
                        case 12:
                        case 13:
                        case 14:
                            this.f24502++;
                            m19661(this.f24496);
                            break;
                        case 15:
                        case 16:
                        case 17:
                            this.f24502--;
                            m19661(this.f24496);
                            break;
                        default:
                            m19661(this.f24496);
                            break;
                    }
                } else {
                    m19664("token recognition error at: '" + this.f24496.getText() + "'");
                    m19661(this.f24496);
                }
            } else if (!arrayDeque3.isEmpty()) {
                m19661(this.f24496);
            } else if (this.f24502 <= 0) {
                InterfaceC19761 c93810 = new C9386(this.f24496);
                boolean z = this.f24504.getType() == 104;
                if (z) {
                    m19662();
                }
                int type3 = this.f24504.getType();
                if (type3 != 102 && type3 != 103) {
                    m19661(c93810);
                    if (z) {
                        int iM19665 = this.f24504.getType() == -1 ? 0 : m19665(this.f24496.getText());
                        if (iM19665 != -1) {
                            m19661(this.f24496);
                            m19663(iM19665);
                        } else {
                            m19664("inconsistent use of tabs and spaces in indentation");
                            m19659(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent use of tabs and spaces in indentation"), this.f24504);
                        }
                    } else {
                        m19663(0);
                    }
                } else {
                    C9386 c93811 = new C9386(c93810);
                    c93811.m24074(1);
                    m19661(c93811);
                    if (z) {
                        m19661(this.f24496);
                    }
                }
            } else {
                C9386 c93812 = new C9386(this.f24496);
                c93812.m24074(1);
                m19661(c93812);
            }
            if (!arrayDeque3.isEmpty() && this.f24504.getType() == 17) {
                int type4 = this.f24496.getType();
                if (type4 == 17) {
                    String str2 = this.f24490;
                    C21493 c21493 = ((C6676) this).f22535;
                    C6676 c6676 = new C6676(new C17965(new C14325(str2, new RunnableC13027(c21493)), c21493), c21493);
                    c6676.m43805();
                    C22905 c22905 = new C22905(c6676, c21493);
                    C15144 c15144 = new C15144(c22905, c21493);
                    c15144.m43805();
                    c15144.m25573();
                    if (c15144.m18916() != 0) {
                        c22905.mo11329(0);
                        C15144 c15145 = new C15144(c22905, c21493);
                        c15145.m43805();
                        c15145.m25516();
                        if (c15145.m18916() != 0) {
                            m19659(this.f24494, "", this.f24504);
                        }
                    }
                } else if (type4 == 19) {
                    m19659(this.f24494, "", this.f24504);
                }
            }
        }
        return (InterfaceC19761) arrayDeque.pollFirst();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m19657(int i) {
        this.f5844.m14224(this.f5847);
        this.f5847 = i;
        this.f24498.push(Integer.valueOf(this.f24495));
        this.f24495 = i;
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
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m19662() {
        InterfaceC19761 interfaceC19761NextToken;
        int type;
        ArrayDeque arrayDeque;
        InterfaceC19761 interfaceC19761NextToken2 = this.f24504;
        if (interfaceC19761NextToken2 == null) {
            interfaceC19761NextToken2 = super.nextToken();
        }
        this.f24496 = interfaceC19761NextToken2;
        int type2 = interfaceC19761NextToken2.getType();
        ArrayDeque arrayDeque2 = this.f24498;
        if (type2 != -1) {
            if (type2 != 106) {
                switch (type2) {
                    case 5:
                        this.f24494 = 6;
                        m19669();
                        break;
                    case 6:
                    case 9:
                        String text = this.f24496.getText();
                        if (text.length() >= 2) {
                            text = text.substring(text.length() - 2);
                        }
                        text.getClass();
                        switch (text) {
                            case ""{":
                            case "'{":
                            case "\{":
                                m19666(14, 0, "{");
                                break;
                        }
                        int type3 = this.f24496.getType();
                        if (type3 != 6 && type3 != 9) {
                            type = this.f24496.getType();
                            arrayDeque = this.f24492;
                            if (type == 19 && type != 58) {
                                if (type == 102) {
                                    m19660(this.f24496.getText());
                                    C9386 c9386 = new C9386(this.f24496);
                                    c9386.m24074(1);
                                    this.f24496 = c9386;
                                    break;
                                } else {
                                    switch (type) {
                                        case 12:
                                        case 13:
                                            m19660(this.f24496.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() + 1));
                                            break;
                                        case 14:
                                            this.f24503.push("{");
                                            arrayDeque.push(0);
                                            m19657(0);
                                            break;
                                        case 15:
                                        case 16:
                                            m19660(this.f24496.getText());
                                            arrayDeque.push(Integer.valueOf(((Integer) arrayDeque.pop()).intValue() - 1));
                                            break;
                                        case 17:
                                            int i = this.f24495;
                                            if (i == 0) {
                                                m19668();
                                                m19667();
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
                                                        m19668();
                                                        m19668();
                                                        m19667();
                                                        break;
                                                    default:
                                                        m19664("f-string: single '}' is not allowed");
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            m19660(this.f24496.getText());
                                            break;
                                    }
                                }
                            } else {
                                m19660(this.f24496.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m19657(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m19657(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m19657(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m19657(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m19657(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m19657(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m19657(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m19657(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m19657(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m19657(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m19657(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m19657(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m19657(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m19657(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m19657(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m19657(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                    case 7:
                    case 10:
                        m19668();
                        break;
                    case 8:
                        this.f24494 = 9;
                        m19669();
                        break;
                    default:
                        if (!arrayDeque2.isEmpty()) {
                            type = this.f24496.getType();
                            arrayDeque = this.f24492;
                            if (type == 19) {
                                m19660(this.f24496.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m19657(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m19657(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m19657(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m19657(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m19657(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m19657(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m19657(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m19657(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m19657(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m19657(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m19657(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m19657(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m19657(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m19657(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m19657(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m19657(32);
                                            break;
                                    }
                                }
                            } else {
                                m19660(this.f24496.getText());
                                if (((Integer) arrayDeque.peek()).intValue() == 0) {
                                    switch (((Integer) arrayDeque2.peek()).intValue()) {
                                        case 1:
                                        case 17:
                                            m19657(17);
                                            break;
                                        case 2:
                                        case 18:
                                            m19657(18);
                                            break;
                                        case 3:
                                        case 19:
                                            m19657(19);
                                            break;
                                        case 4:
                                        case 20:
                                            m19657(20);
                                            break;
                                        case 5:
                                        case 21:
                                            m19657(21);
                                            break;
                                        case 6:
                                        case 22:
                                            m19657(22);
                                            break;
                                        case 7:
                                        case 23:
                                            m19657(23);
                                            break;
                                        case 8:
                                        case 24:
                                            m19657(24);
                                            break;
                                        case 9:
                                        case 25:
                                            m19657(25);
                                            break;
                                        case 10:
                                        case 26:
                                            m19657(26);
                                            break;
                                        case 11:
                                        case 27:
                                            m19657(27);
                                            break;
                                        case 12:
                                        case 28:
                                            m19657(28);
                                            break;
                                        case 13:
                                        case 29:
                                            m19657(29);
                                            break;
                                        case 14:
                                        case 30:
                                            m19657(30);
                                            break;
                                        case 15:
                                        case 31:
                                            m19657(31);
                                            break;
                                        case 16:
                                        case 32:
                                            m19657(32);
                                            break;
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        } else if (!arrayDeque2.isEmpty()) {
            m19664("unterminated interpolated string literal");
        }
        if (this.f24496.getType() == -1) {
            interfaceC19761NextToken = this.f24496;
        } else {
            interfaceC19761NextToken = super.nextToken();
        }
        this.f24504 = interfaceC19761NextToken;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m19663(int i) {
        int iIntValue = ((Integer) this.f24500.peek()).intValue();
        if (i > iIntValue) {
            m19659(2, (String) null, this.f24504);
            this.f24500.push(Integer.valueOf(i));
            return;
        }
        while (i < iIntValue) {
            this.f24500.pop();
            iIntValue = ((Integer) this.f24500.peek()).intValue();
            if (i <= iIntValue) {
                m19659(3, (String) null, this.f24504);
            } else {
                m19664("inconsistent dedent");
                m19659(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent dedent"), this.f24504);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m19665(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '\t') {
                this.f24491 = true;
                i += 8 - (i % 8);
            } else if (c == '\f') {
                i = 0;
            } else if (c == ' ') {
                this.f24499 = true;
                i++;
            }
        }
        if (!this.f24491 || !this.f24499 || this.f24505) {
            return i;
        }
        this.f24505 = true;
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19660(String str) {
        this.f24503.push(((String) this.f24503.pop()) + str);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m19669() {
        Integer num = (Integer) f24489.get(this.f24496.getText().toLowerCase());
        if (num != null) {
            m19657(num.intValue());
            return;
        }
        m19664("internal error: unknown interpolated string literal prefix: " + this.f24496.getText());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m19667() {
        this.f24492.pop();
        this.f24490 = C15489.m37076((String) this.f24503.pop(), l.d);
        if (this.f24503.isEmpty()) {
            return;
        }
        StringBuilder sbM23356 = C9023.m23356((String) this.f24503.pop());
        sbM23356.append(this.f24490);
        this.f24503.push(sbM23356.toString());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m19666(int i, int i2, String str) {
        String strM46498 = C20630.m46498(1, 0, this.f24496.getText());
        C9386 c9386 = new C9386(this.f24496);
        c9386.m24075(strM46498);
        c9386.m24076(c9386.mo22510() - 1);
        m19661(c9386);
        m19658(i, i2, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19658(int i, int i2, String str) {
        C9386 c9386 = new C9386(this.f24496);
        c9386.m24072(i);
        c9386.m24075(str);
        c9386.m24074(i2);
        c9386.m24078(c9386.mo22509() + 1);
        c9386.m24073(c9386.mo22508() + 1);
        c9386.m24076(c9386.mo22508());
        this.f24496 = c9386;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m19668() {
        m4953();
        this.f24495 = ((Integer) this.f24498.pop()).intValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19659(int i, String str, InterfaceC19761 interfaceC19761) {
        C9386 c9386 = new C9386(interfaceC19761);
        c9386.m24072(i);
        c9386.m24074(0);
        c9386.m24076(interfaceC19761.mo22508() - 1);
        if (str == null) {
            str = "<" + C10205.f34856.m47630(i) + ">";
        }
        c9386.m24075(str);
        m19661(c9386);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19661(InterfaceC19761 interfaceC19761) {
        this.f24506 = interfaceC19761.getType();
        if (interfaceC19761.mo22512() == 0) {
            this.f24501 = this.f24506;
        }
        this.f24497.addLast(interfaceC19761);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m19664(String str) {
        m43801().mo11174(this, Integer.valueOf(this.f24496.getType()), this.f24496.getLine(), this.f24496.mo22509(), C0252.m1693(" LEXER ERROR: ", str), (C21877) null);
    }
}
