package l;

/* JADX INFO: renamed from: l.ۤ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11112 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18483 f35032;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f35033;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public StringBuilder f35034;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char f35035;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f35036;

    public C11112(char c, int i, int i2) {
        C18483 c18483 = new C18483();
        this.f35032 = c18483;
        this.f35034 = new StringBuilder();
        this.f35035 = c;
        this.f35036 = i;
        String.valueOf(c);
        c18483.m43075(Integer.valueOf(i));
        c18483.m43070(i2);
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f35032;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        int iMo14654 = interfaceC4753.mo14654();
        int index = interfaceC4753.getIndex();
        CharSequence charSequenceM34537 = interfaceC4753.getLine().m34537();
        int iMo14650 = interfaceC4753.mo14650();
        C18483 c18483 = this.f35032;
        if (iMo14650 < 4 && iMo14654 < charSequenceM34537.length()) {
            int length = charSequenceM34537.length();
            for (int i = iMo14654; i < length; i++) {
                if (charSequenceM34537.charAt(i) != this.f35035) {
                    length = i;
                    break;
                }
            }
            int i2 = length - iMo14654;
            if (i2 >= this.f35036 && C6790.m18956(iMo14654 + i2, charSequenceM34537.length(), charSequenceM34537) == charSequenceM34537.length()) {
                c18483.m43071(Integer.valueOf(i2));
                return new C7932(-1, -1, true);
            }
        }
        int length2 = charSequenceM34537.length();
        for (int iM43069 = c18483.m43069(); iM43069 > 0 && index < length2 && charSequenceM34537.charAt(index) == ' '; iM43069--) {
            index++;
        }
        return C7932.m21504(index);
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo7445(C14228 c14228) {
        if (this.f35033 == null) {
            this.f35033 = c14228.m34537().toString();
            return;
        }
        CharSequence charSequenceM34537 = c14228.m34537();
        StringBuilder sb = this.f35034;
        sb.append(charSequenceM34537);
        sb.append('\n');
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۚ */
    public final void mo7446() {
        String strM40051 = C16991.m40051(this.f35033.trim());
        C18483 c18483 = this.f35032;
        c18483.m43072(strM40051);
        c18483.m43076(this.f35034.toString());
    }
}
