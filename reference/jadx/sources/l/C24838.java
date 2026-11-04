package l;

/* JADX INFO: renamed from: l.᩻ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A6PB */
/* JADX INFO: loaded from: classes2.dex */
public final class C24838 extends AbstractC16632 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C6485 f80331 = new C6485();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C22191 f80332 = new C22191(new String[]{null, null, "'<!--'", "'<![CDATA['", "'<!'", null, null, null, null, null, "'/>'", null, null, "'='", null, "'/'"}, new String[]{null, "RawText", "Comment", "Cdata", "Declaration", "Processing", "EndOpen", "TagOpen", "Text", "Other", "SelfClose", "TagClose", "TagSpace", "Equals", "TagWord", "Slash", "BrokenQuoted", "TagOther", "ValueSpace", "QuotedValue", "BareValue"}, null);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f80333 = new String[21];

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C25351[] f80334;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11002 f80335;

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f80333;
            if (i2 >= strArr.length) {
                break;
            }
            C22191 c22191 = f80332;
            String strM50200 = c22191.m50200(i2);
            strArr[i2] = strM50200;
            if (strM50200 == null) {
                strArr[i2] = c22191.m50199(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        C11002 c11002M56094 = new C25175().m56094("\u0004\u0000\u0014¼\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006]\b\u0006\u000b\u0006\f\u0006^\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nm\b\n\u000b\n\f\nn\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fv\b\f\u000b\f\f\fw\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005\u000e~\b\u000e\n\u000e\f\u000e\u0081\t\u000e\u0001\u000e\u0003\u000e\u0084\b\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0088\b\u000e\n\u000e\f\u000e\u008b\t\u000e\u0001\u000e\u0003\u000e\u008e\b\u000e\u0003\u000e\u0090\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u0095\b\u0010\u000b\u0010\f\u0010\u0096\u0001\u0011\u0001\u0011\u0005\u0011\u009b\b\u0011\n\u0011\f\u0011\u009e\t\u0011\u0001\u0011\u0003\u0011¡\b\u0011\u0001\u0011\u0001\u0011\u0005\u0011¥\b\u0011\n\u0011\f\u0011¨\t\u0011\u0001\u0011\u0003\u0011«\b\u0011\u0003\u0011\u00ad\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012²\b\u0012\u000b\u0012\f\u0012³\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013'\u0014)\u0000\u0003\u0000\u0001\u0002\n\u0001\u0000>>\u0001\u0001>>\u0001\u0000<<\u0003\u0000\t\n\f\r  \u0007\u0000\t\n\f\r  \"\"''//<>\u0001\u0000\"\"\u0001\u0001\"\"\u0001\u0000''\u0001\u0001''\u0006\u0000\t\n\f\r  \"\"''>>Å\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0002'\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u00052\u0001\u0000\u0000\u0000\u0007>\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011`\u0001\u0000\u0000\u0000\u0013b\u0001\u0000\u0000\u0000\u0015g\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001bu\u0001\u0000\u0000\u0000\u001dy\u0001\u0000\u0000\u0000\u001f\u008f\u0001\u0000\u0000\u0000!\u0091\u0001\u0000\u0000\u0000#\u0094\u0001\u0000\u0000\u0000%¬\u0001\u0000\u0000\u0000'±\u0001\u0000\u0000\u0000)·\u0001\u0000\u0000\u0000+,\u0005<\u0000\u0000,-\u0005!\u0000\u0000-.\u0005-\u0000\u0000./\u0005-\u0000\u0000/0\u0001\u0000\u0000\u000001\u0006\u0000\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005<\u0000\u000034\u0005!\u0000\u000045\u0005[\u0000\u000056\u0005C\u0000\u000067\u0005D\u0000\u000078\u0005A\u0000\u000089\u0005T\u0000\u00009:\u0005A\u0000\u0000:;\u0005[\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0006\u0001\u0001\u0000=\u0006\u0001\u0000\u0000\u0000>?\u0005<\u0000\u0000?@\u0005!\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0006\u0002\u0002\u0000B\b\u0001\u0000\u0000\u0000CD\u0005<\u0000\u0000DE\u0005?\u0000\u0000EI\u0001\u0000\u0000\u0000FH\b\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0007\u0001\u0000\u0000ML\u0001\u0000\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0005<\u0000\u0000PQ\u0005/\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0004\u0004\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0006\u0004\u0003\u0000U\f\u0001\u0000\u0000\u0000VW\u0005<\u0000\u0000WX\u0004\u0005\u0001\u0000XY\u0001\u0000\u0000\u0000YZ\u0006\u0005\u0003\u0000Z\u000e\u0001\u0000\u0000\u0000[]\b\u0002\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0010\u0001\u0000\u0000\u0000`a\t\u0000\u0000\u0000a\u0012\u0001\u0000\u0000\u0000bc\u0005/\u0000\u0000cd\u0005>\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0006\b\u0004\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005>\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0006\t\u0004\u0000j\u0016\u0001\u0000\u0000\u0000km\u0007\u0003\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u0018\u0001\u0000\u0000\u0000pq\u0005=\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\u000b\u0005\u0000s\u001a\u0001\u0000\u0000\u0000tv\b\u0004\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u001c\u0001\u0000\u0000\u0000yz\u0005/\u0000\u0000z\u001e\u0001\u0000\u0000\u0000{\u007f\u0005\"\u0000\u0000|~\b\u0005\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0006\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0090\u0001\u0000\u0000\u0000\u0085\u0089\u0005'\u0000\u0000\u0086\u0088\b\u0007\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0007\b\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f{\u0001\u0000\u0000\u0000\u008f\u0085\u0001\u0000\u0000\u0000\u0090 \u0001\u0000\u0000\u0000\u0091\u0092\t\u0000\u0000\u0000\u0092\"\u0001\u0000\u0000\u0000\u0093\u0095\u0007\u0003\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097$\u0001\u0000\u0000\u0000\u0098\u009c\u0005\"\u0000\u0000\u0099\u009b\b\u0005\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d \u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f¡\u0007\u0006\u0000\u0000 \u009f\u0001\u0000\u0000\u0000¡\u00ad\u0001\u0000\u0000\u0000¢¦\u0005'\u0000\u0000£¥\b\u0007\u0000\u0000¤£\u0001\u0000\u0000\u0000¥¨\u0001\u0000\u0000\u0000¦¤\u0001\u0000\u0000\u0000¦§\u0001\u0000\u0000\u0000§ª\u0001\u0000\u0000\u0000¨¦\u0001\u0000\u0000\u0000©«\u0007\b\u0000\u0000ª©\u0001\u0000\u0000\u0000«\u00ad\u0001\u0000\u0000\u0000¬\u0098\u0001\u0000\u0000\u0000¬¢\u0001\u0000\u0000\u0000\u00ad®\u0001\u0000\u0000\u0000®¯\u0006\u0011\u0006\u0000¯&\u0001\u0000\u0000\u0000°²\b\t\u0000\u0000±°\u0001\u0000\u0000\u0000²³\u0001\u0000\u0000\u0000³±\u0001\u0000\u0000\u0000³´\u0001\u0000\u0000\u0000´µ\u0001\u0000\u0000\u0000µ¶\u0006\u0012\u0006\u0000¶(\u0001\u0000\u0000\u0000·¸\u0005>\u0000\u0000¸¹\u0001\u0000\u0000\u0000¹º\u0006\u0013\u0007\u0000º»\u0006\u0013\u0004\u0000»*\u0001\u0000\u0000\u0000\u0014\u0000\u0001\u0002IM^nw\u007f\u0083\u0089\u008d\u008f\u0096\u009c ¦ª¬³\b\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002\u0005\u0001\u0000\u0004\u0000\u0000\u0002\u0002\u0000\u0002\u0001\u0000\u0007\u000b\u0000".toCharArray());
        f80335 = c11002M56094;
        f80334 = new C25351[c11002M56094.f34749.size()];
        while (true) {
            C11002 c11002 = f80335;
            if (i >= c11002.f34749.size()) {
                return;
            }
            f80334[i] = new C25351(c11002.m27846(i), i);
            i++;
        }
    }

    @Override // l.AbstractC9488
    @Deprecated
    /* JADX INFO: renamed from: ۚ */
    public final String[] mo6653() {
        return f80333;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ֫ */
    public final C22191 mo6640() {
        return f80332;
    }

    public C24838(C18870 c18870) {
        super(c18870);
        this.f30727 = new C1308(this, f80335, f80334, f80331);
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ۤ */
    public final C11002 mo6669() {
        return f80335;
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ۙ */
    public final void mo15472(int i, int i2) {
        InterfaceC17693 interfaceC17693 = this.f48057;
        if (i != 0) {
            if (i == 1) {
                if (i2 != 1) {
                    return;
                }
                m39354();
                return;
            } else {
                if (i == 2 && i2 == 2) {
                    while (interfaceC17693.mo11537(1) != -1) {
                        int iMo11537 = interfaceC17693.mo11537(1);
                        ((C1308) m24871()).m4769(interfaceC17693);
                        if (iMo11537 == 62) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (i2 != 0) {
            return;
        }
        char c = 0;
        while (interfaceC17693.mo11537(1) != -1) {
            int iMo11538 = interfaceC17693.mo11537(1);
            ((C1308) m24871()).m4769(interfaceC17693);
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (iMo11538 == 62) {
                                    return;
                                }
                                if (iMo11538 == 45) {
                                    c = 3;
                                }
                            } else {
                                if (iMo11538 == 62) {
                                    return;
                                }
                                if (iMo11538 == 33) {
                                    c = 5;
                                } else if (iMo11538 == 45) {
                                }
                            }
                        } else {
                            c = iMo11538 == 45 ? (char) 4 : (char) 2;
                        }
                    } else if (iMo11538 == 45) {
                        c = 3;
                    }
                } else if (iMo11538 == 62) {
                    return;
                } else {
                    if (iMo11538 == 45) {
                    }
                }
            } else {
                if (iMo11538 == 62) {
                    return;
                }
                if (iMo11538 == 45) {
                    c = 1;
                }
            }
        }
    }

    @Override // l.AbstractC9488
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6650(C2777 c2777, int i, int i2) {
        InterfaceC17693 interfaceC17693 = this.f48057;
        if (i != 4) {
            if (i == 5 && i2 == 1) {
                int iMo11537 = interfaceC17693.mo11537(1);
                return (iMo11537 >= 97 && iMo11537 <= 122) || (iMo11537 >= 65 && iMo11537 <= 90);
            }
        } else if (i2 == 0) {
            int iMo11538 = interfaceC17693.mo11537(1);
            return (iMo11538 >= 97 && iMo11538 <= 122) || (iMo11538 >= 65 && iMo11538 <= 90);
        }
        return true;
    }
}
