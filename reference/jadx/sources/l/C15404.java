package l;

/* JADX INFO: renamed from: l.ܶᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 62A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C15404 implements InterfaceC2557 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2557 f50208 = new C23165("..", "", null, -1, 0, false);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC4968 f50209;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f50210;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f50211;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f50212;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16667 f50213;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50214;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f50215;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f50216;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f50217 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14600 f50218;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f50219;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f50220;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f50221;

    /* JADX INFO: renamed from: ۙ */
    public boolean mo15712() {
        return this instanceof C10964;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۠ۙ */
    public boolean mo7969() {
        return this instanceof C23165;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۤܰ */
    public C11731 mo7971() {
        return null;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۫ۙ */
    public CharSequence mo7973() {
        return null;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܺ */
    public CharSequence mo7981() {
        return null;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܽ */
    public boolean mo7984() {
        return this instanceof C8348;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo7987() {
        return false;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ᩺ܰ */
    public boolean mo7991() {
        return false;
    }

    public C15404(String str, String str2, String str3, long j, long j2, boolean z) {
        String strConcat = "/";
        if (str2 != null && !str2.isEmpty()) {
            str2 = str2.startsWith("/") ? str2 : "/".concat(str2);
            strConcat = !str2.endsWith("/") ? str2.concat("/") : str2;
        }
        this.f50221 = str;
        this.f50216 = strConcat;
        this.f50212 = str3;
        this.f50210 = j;
        this.f50211 = j2;
        this.f50219 = z;
    }

    @Override // l.InterfaceC2557
    public final String getName() {
        return this.f50221;
    }

    public final String toString() {
        return this.f50221;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ֫ */
    public final String mo7963() {
        String str = this.f50221;
        return str.length() <= 500 ? str : str.substring(0, 500);
    }

    @Override // l.InterfaceC2557
    public final String getParent() {
        return this.f50216;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܶܰ */
    public final boolean mo7980() {
        return (this instanceof C23165) || mo7991() || (this instanceof C8348);
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ᩷ܰ */
    public AbstractC20745 mo7989() {
        return C5553.m15313(getPath(), new String[0]);
    }

    @Override // l.InterfaceC2557
    public final String getPath() {
        String str = this.f50221;
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.f50216;
        return zIsEmpty ? C15489.m37076(str2, "/") : C15489.m37076(str2, str);
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۟ܰ */
    public int mo7968() {
        if (this instanceof C23165) {
            return 0;
        }
        if (isDirectory()) {
            return 5;
        }
        return !mo7991() ? 10 : 15;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܶۙ */
    public final String mo7979() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f50216);
        return C22697.m50267(sb, this.f50221, "/");
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۟ۙ */
    public final String mo7967() {
        return (isDirectory() || mo7991()) ? "*/*" : mo7972().m48185();
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۤۙ */
    public final String mo7970() {
        InterfaceC4968 interfaceC4968 = this.f50209;
        if (interfaceC4968 != null) {
            return ((C21512) interfaceC4968.get()).m48176().toLowerCase();
        }
        return mo7989().m46726().toLowerCase();
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۙ */
    public final void mo7965(InterfaceC4968 interfaceC4968) {
        this.f50209 = interfaceC4968;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۧܰ */
    public final C21512 mo7972() {
        InterfaceC4968 interfaceC4968 = this.f50209;
        if (interfaceC4968 == null) {
            return C21512.m48160(this.f50221, true);
        }
        return (C21512) interfaceC4968.get();
    }

    @Override // l.InterfaceC2557
    public final long getSize() {
        return this.f50210;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36873(long j) {
        this.f50217 = j;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ᩹ܰ */
    public final long mo7990() {
        return this.f50217;
    }

    @Override // l.InterfaceC2557
    public final long getTime() {
        return this.f50211;
    }

    @Override // l.InterfaceC2557
    public final void setTime(long j) {
        this.f50211 = j;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܽۙ */
    public final boolean mo7985() {
        return !mo7980() && this.f50219;
    }

    @Override // l.InterfaceC2557
    public final boolean isDirectory() {
        return (mo7980() || this.f50219) ? false : true;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo7986() {
        return this.f50212 != null;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܰۙ */
    public final String mo7978() {
        return this.f50212;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36874(String str) {
        this.f50212 = str;
    }

    @Override // l.InterfaceC2557
    public final boolean isChecked() {
        return this.f50220;
    }

    @Override // l.InterfaceC2557
    public final void setChecked(boolean z) {
        if (mo7980()) {
            throw new RuntimeException();
        }
        this.f50220 = z;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܺܰ */
    public final boolean mo7983() {
        return this.f50214;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܰ */
    public final void mo7977(boolean z) {
        if (mo7980()) {
            throw new RuntimeException();
        }
        this.f50214 = z;
    }

    @Override // l.InterfaceC2557
    public final C14600 getIcon() {
        return this.f50218;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۙ */
    public final void mo7966(C14600 c14600) {
        this.f50218 = c14600;
        this.f50215 = 0;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܰ */
    public final void mo7975(int i) {
        this.f50215 = i;
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܺۙ */
    public boolean mo7982() {
        if (mo7980() || this.f50210 == -1) {
            return false;
        }
        return !isDirectory() || mo15712();
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۙ */
    public final void mo7964(C0690 c0690) {
        mo7966(c0690.f2943);
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ᩶ۙ */
    public final int mo7988() {
        return this.f50215;
    }

    @Override // 
    public final InterfaceC2557 clone() {
        try {
            return (InterfaceC2557) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ܰ */
    public final void mo7976(int i, Object obj) {
        C16667 c16667 = this.f50213;
        if (c16667 == null) {
            c16667 = new C16667();
            this.f50213 = c16667;
        }
        c16667.mo8944(i, obj);
    }

    @Override // l.InterfaceC2557
    /* JADX INFO: renamed from: ۬ */
    public final Object mo7974(int i) {
        C16667 c16667 = this.f50213;
        if (c16667 == null) {
            return null;
        }
        return c16667.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15404 c15404 = (C15404) obj;
        if (this.f50210 == c15404.f50210 && this.f50211 == c15404.f50211 && this.f50219 == c15404.f50219 && this.f50221.equals(c15404.f50221) && this.f50216.equals(c15404.f50216)) {
            return C13638.equals(this.f50212, c15404.f50212);
        }
        return false;
    }

    public int hashCode() {
        int iM33812 = C13958.m33812(this.f50221.hashCode() * 31, 31, this.f50216);
        long j = this.f50210;
        int i = (iM33812 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f50211;
        int i2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f50219 ? 1 : 0)) * 31;
        String str = this.f50212;
        return i2 + (str != null ? str.hashCode() : 0);
    }
}
