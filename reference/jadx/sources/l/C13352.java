package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.۫᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 62A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C13352 implements InterfaceC2386 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2386 f42573 = new C15589("..", "", null, -1, 0, false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C11983 f42574;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f42575;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f42576;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22311 f42577;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f42578;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f42579;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f42580;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f42581;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f42582;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f42583 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC21941 f42584;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42585;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f42586;

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ֡ */
    public boolean mo8089() {
        return this instanceof C25287;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۗۙ */
    public boolean mo8092() {
        return this instanceof C15589;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo8381() {
        return this instanceof C10411;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۛ᩷ */
    public C9097 mo5155() {
        return null;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۟ۙ */
    public CharSequence mo8099() {
        return null;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ܰ */
    public CharSequence mo8101() {
        return null;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩹ */
    public boolean mo8113() {
        return false;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩻᩷ */
    public boolean mo8116() {
        return false;
    }

    public C13352(String str, String str2, String str3, long j, long j2, boolean z) {
        String strConcat = "/";
        if (str2 != null && !str2.isEmpty()) {
            str2 = str2.startsWith("/") ? str2 : "/".concat(str2);
            strConcat = !str2.endsWith("/") ? str2.concat("/") : str2;
        }
        this.f42580 = str;
        this.f42576 = strConcat;
        this.f42581 = str3;
        this.f42579 = j;
        this.f42582 = j2;
        this.f42585 = z;
    }

    @Override // l.InterfaceC2386
    public final String getName() {
        return this.f42580;
    }

    public final String toString() {
        return this.f42580;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۠ */
    public final String mo8100() {
        String str = this.f42580;
        return str.length() <= 500 ? str : str.substring(0, 500);
    }

    @Override // l.InterfaceC2386
    public final String getParent() {
        return this.f42576;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ܺ᩷ */
    public final boolean mo8106() {
        return (this instanceof C15589) || mo8116() || (this instanceof C25287);
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۘ᩷ */
    public AbstractC22044 mo8093() {
        return C14584.m35193(getPath(), new String[0]);
    }

    @Override // l.InterfaceC2386
    public final String getPath() {
        String str = this.f42580;
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.f42576;
        return zIsEmpty ? C14483.m34972(str2, "/") : C14483.m34972(str2, str);
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩺᩷ */
    public int mo8115() {
        if (this instanceof C15589) {
            return 0;
        }
        if (isDirectory()) {
            return 5;
        }
        return !mo8116() ? 10 : 15;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ܺۙ */
    public final String mo8105() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42576);
        return C8947.m23910(sb, this.f42580, "/");
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩺ۙ */
    public final String mo8114() {
        return (isDirectory() || mo8116()) ? "*/*" : mo8091().m23975();
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۛۙ */
    public final String mo8098() {
        InterfaceC21941 interfaceC21941 = this.f42584;
        if (interfaceC21941 != null) {
            return ((C8969) interfaceC21941.get()).m23974().toLowerCase(Locale.ROOT);
        }
        return AbstractC22044.m49832(mo8093().getName().toLowerCase(Locale.ROOT));
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۙ */
    public final void mo8096(InterfaceC21941 interfaceC21941) {
        this.f42584 = interfaceC21941;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ֨᩷ */
    public final C8969 mo8091() {
        InterfaceC21941 interfaceC21941 = this.f42584;
        if (interfaceC21941 == null) {
            return C8969.m23952(this.f42580, true);
        }
        return (C8969) interfaceC21941.get();
    }

    @Override // l.InterfaceC2386
    public final long getSize() {
        return this.f42579;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32930(long j) {
        this.f42583 = j;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ܳ᩷ */
    public final long mo8104() {
        return this.f42583;
    }

    @Override // l.InterfaceC2386
    public final long getTime() {
        return this.f42582;
    }

    @Override // l.InterfaceC2386
    public final void setTime(long j) {
        this.f42582 = j;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ֡ۙ */
    public final boolean mo8090() {
        return !mo8106() && this.f42585;
    }

    @Override // l.InterfaceC2386
    public final boolean isDirectory() {
        return (mo8106() || this.f42585) ? false : true;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo8107() {
        return this.f42581 != null;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩷ۙ */
    public final String mo8112() {
        return this.f42581;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32931(String str) {
        this.f42581 = str;
    }

    @Override // l.InterfaceC2386
    public final boolean isChecked() {
        return this.f42586;
    }

    @Override // l.InterfaceC2386
    public final void setChecked(boolean z) {
        if (mo8106()) {
            throw new RuntimeException();
        }
        this.f42586 = z;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ܰ᩷ */
    public final boolean mo8103() {
        return this.f42575;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8111(boolean z) {
        if (mo8106()) {
            throw new RuntimeException();
        }
        this.f42575 = z;
    }

    @Override // l.InterfaceC2386
    public final C11983 getIcon() {
        return this.f42574;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۙ */
    public final void mo8094(C11983 c11983) {
        this.f42574 = c11983;
        this.f42578 = 0;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8109(int i) {
        this.f42578 = i;
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۙ */
    public final void mo8095(C20613 c20613) {
        mo8094(c20613.f66114);
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ܰۙ */
    public boolean mo8102() {
        if (mo8106() || this.f42579 == -1) {
            return false;
        }
        return !isDirectory() || mo8381();
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩶ۙ */
    public final int mo8108() {
        return this.f42578;
    }

    @Override // 
    public final InterfaceC2386 clone() {
        try {
            return (InterfaceC2386) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8110(int i, Object obj) {
        C22311 c22311 = this.f42577;
        if (c22311 == null) {
            c22311 = new C22311();
            this.f42577 = c22311;
        }
        c22311.mo13466(i, obj);
    }

    @Override // l.InterfaceC2386
    /* JADX INFO: renamed from: ۚ */
    public final Object mo8097(int i) {
        C22311 c22311 = this.f42577;
        if (c22311 == null) {
            return null;
        }
        return c22311.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13352 c13352 = (C13352) obj;
        if (this.f42579 == c13352.f42579 && this.f42582 == c13352.f42582 && this.f42585 == c13352.f42585 && this.f42580.equals(c13352.f42580) && this.f42576.equals(c13352.f42576)) {
            return C17359.equals(this.f42581, c13352.f42581);
        }
        return false;
    }

    public int hashCode() {
        int iM30817 = C12351.m30817(this.f42580.hashCode() * 31, 31, this.f42576);
        long j = this.f42579;
        int i = (iM30817 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f42582;
        int i2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f42585 ? 1 : 0)) * 31;
        String str = this.f42581;
        return i2 + (str != null ? str.hashCode() : 0);
    }
}
