package l;

import java.util.Map;

/* JADX INFO: renamed from: l.۬ۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13839 implements InterfaceC4717 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f43921 = C16980.m40037(C13839.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f43922;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f43923;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f43924;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f43925;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f43926;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13839 f43927 = this;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Map f43928;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f43929;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f43930;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f43931;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f43932;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f43933;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f43934;

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ᩸ */
    public final C13839 mo14618() {
        if (InterfaceC4717.class.isAssignableFrom(C13839.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ۤ */
    public final long mo14612() {
        return this.f43932;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ᩻ */
    public final int mo14619() {
        return this.f43922;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ᩷ */
    public final String mo14617() {
        return this.f43923;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33791(String str) {
        this.f43923 = str;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ۧ */
    public final String mo14613() {
        return this.f43931;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33797(String str) {
        this.f43931 = str;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ۚ */
    public final void mo14611() {
        this.f43933 = "\\";
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ۙ */
    public final String mo14609() {
        return this.f43934;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ܳ */
    public final String mo14615() {
        return this.f43929;
    }

    @Override // l.InterfaceC4717
    public final String getPath() {
        return this.f43924;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m33794() {
        return this.f43926;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33792(Map map) {
        this.f43928 = map;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ֫ */
    public final void mo14608() {
        String str;
        Map map = this.f43928;
        if (map == null || (str = this.f43933) == null) {
            return;
        }
        map.put(str, this);
    }

    @Override // l.InterfaceC4717
    public final C13839 next() {
        return this.f43927;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ۫ */
    public final C13839 mo14614() {
        return this.f43927;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33793(InterfaceC4717 interfaceC4717) {
        C13839 c13839 = (C13839) interfaceC4717;
        c13839.f43927 = this.f43927;
        this.f43927 = c13839;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ۙ */
    public final void mo14610(int i) {
        int i2 = this.f43922;
        if (i > i2) {
            throw new IllegalArgumentException("Stripping more than consumed");
        }
        this.f43922 = i2 - i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m33795() {
        this.f43925 = true;
    }

    @Override // l.InterfaceC4717
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo14616() {
        return this.f43925;
    }

    public final String toString() {
        return "DfsReferralData[pathConsumed=" + this.f43922 + ",server=" + this.f43934 + ",share=" + this.f43929 + ",link=" + this.f43931 + ",path=" + this.f43924 + ",ttl=" + this.f43930 + ",expiration=" + this.f43932 + ",remain=" + (this.f43932 - System.currentTimeMillis()) + "]";
    }

    public final int hashCode() {
        return C17359.hash(this.f43934, this.f43929, this.f43924, Integer.valueOf(this.f43922));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC4717)) {
            return false;
        }
        InterfaceC4717 interfaceC4717 = (InterfaceC4717) obj;
        return C17359.equals(this.f43934, interfaceC4717.mo14609()) && C17359.equals(this.f43929, interfaceC4717.mo14615()) && C17359.equals(this.f43924, interfaceC4717.getPath()) && Integer.valueOf(this.f43922).equals(Integer.valueOf(interfaceC4717.mo14619()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13839 m33790(C22617 c22617, String str, long j, int i) {
        C13839 c13839 = new C13839();
        String[] strArr = new String[4];
        c13839.f43930 = c22617.f73085;
        int i2 = c22617.f73086;
        c13839.f43926 = i2;
        c13839.f43932 = j;
        int i3 = i2 & 2;
        InterfaceC25186 interfaceC25186 = f43921;
        if (i3 == 2) {
            String[] strArr2 = c22617.f73093;
            if (strArr2.length > 0) {
                c13839.f43934 = strArr2[0].substring(1).toLowerCase();
            } else {
                c13839.f43934 = c22617.f73088.substring(1).toLowerCase();
            }
            if (interfaceC25186.mo13707()) {
                StringBuilder sb = new StringBuilder("Server ");
                C4794.m14774(sb, c13839.f43934, " path ", str, " remain ");
                sb.append(str.substring(i));
                sb.append(" path consumed ");
                sb.append(i);
                interfaceC25186.mo13721(sb.toString());
            }
            c13839.f43922 = i;
            return c13839;
        }
        if (interfaceC25186.mo13707()) {
            StringBuilder sb2 = new StringBuilder("Node ");
            C4794.m14774(sb2, c22617.f73091, " path ", str, " remain ");
            sb2.append(str.substring(i));
            sb2.append(" path consumed ");
            sb2.append(i);
            interfaceC25186.mo13721(sb2.toString());
        }
        String str2 = c22617.f73091;
        int length = str2.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 == 3) {
                strArr[3] = str2.substring(i6);
                strArr[3] = str2.substring(i6);
                break;
            }
            if (i5 == length || str2.charAt(i5) == '\\') {
                strArr[i4] = str2.substring(i6, i5);
                i6 = i5 + 1;
                i4++;
            }
            int i7 = i5 + 1;
            if (i5 >= length) {
                while (i4 < 4) {
                    strArr[i4] = "";
                    i4++;
                }
                break;
            }
            i5 = i7;
        }
        c13839.f43934 = strArr[1];
        c13839.f43929 = strArr[2];
        c13839.f43924 = strArr[3];
        c13839.f43922 = i;
        if (str.charAt(i - 1) == '\\') {
            if (interfaceC25186.mo13707()) {
                interfaceC25186.mo13721("Server consumed trailing slash of request path, adjusting");
            }
            c13839.f43922--;
        }
        if (interfaceC25186.mo13707()) {
            String strSubstring = str.substring(0, i);
            StringBuilder sbM51387 = C22783.m51387("Request ", str, " ref path ");
            sbM51387.append(c13839.f43924);
            sbM51387.append(" consumed ");
            sbM51387.append(c13839.f43922);
            sbM51387.append(": ");
            sbM51387.append(strSubstring);
            interfaceC25186.mo13721(sbM51387.toString());
        }
        return c13839;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13839 m33796(InterfaceC4717 interfaceC4717) {
        C13839 c13839 = new C13839();
        c13839.f43934 = interfaceC4717.mo14609();
        c13839.f43929 = interfaceC4717.mo14615();
        c13839.f43932 = interfaceC4717.mo14612();
        c13839.f43924 = interfaceC4717.getPath();
        int iMo14619 = interfaceC4717.mo14619() + this.f43922;
        c13839.f43922 = iMo14619;
        String str = this.f43924;
        if (str != null) {
            c13839.f43922 = iMo14619 - (str.length() + 1);
        }
        c13839.f43923 = interfaceC4717.mo14617();
        return c13839;
    }
}
