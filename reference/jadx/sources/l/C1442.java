package l;

import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֨᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z71T */
/* JADX INFO: loaded from: classes2.dex */
public final class C1442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f5052;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f5053;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f5054;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f5055;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6597 f5056;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C13921 f5051 = new C13921(1);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C6597 f5050 = new C6597(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10390 m5186(String str, boolean z) throws IOException {
        String strMo2954;
        HashSet hashSet = null;
        for (int i = 0; i <= 64; i++) {
            AbstractC22044 abstractC22044M35193 = C14584.m35193(str, new String[0]);
            String strMo4278 = abstractC22044M35193.mo4278();
            if (hashSet != null && !hashSet.add(strMo4278)) {
                throw new IOException("Symbolic link cycle in hex target");
            }
            if (z && (abstractC22044M35193 instanceof C7302)) {
                C21694 c21694M19978 = ((C7302) abstractC22044M35193).m19978();
                if (c21694M19978.m49239() != 'l') {
                    strMo2954 = null;
                } else {
                    strMo2954 = c21694M19978.m49240();
                    if (strMo2954 == null) {
                        throw new IOException("Hex target link metadata is unavailable");
                    }
                }
            } else {
                strMo2954 = abstractC22044M35193.mo2954();
            }
            if (strMo2954 == null) {
                return new C10390(abstractC22044M35193, strMo4278);
            }
            if (hashSet == null) {
                hashSet = new HashSet();
                hashSet.add(strMo4278);
            }
            if (i == 64) {
                throw new IOException("Too many symbolic links in hex target");
            }
            if (!strMo2954.startsWith("/")) {
                AbstractC22044 abstractC22044M49858 = abstractC22044M35193.m49858();
                while (true) {
                    if (abstractC22044M49858 != null) {
                        if (strMo2954.isEmpty() || strMo2954.equals(".")) {
                            str = abstractC22044M49858.mo4294();
                            break;
                        }
                        if (strMo2954.equals("..")) {
                            str = abstractC22044M49858.getParent();
                            break;
                        }
                        if (strMo2954.startsWith("./")) {
                            strMo2954 = strMo2954.substring(2);
                        } else if (strMo2954.startsWith("../")) {
                            strMo2954 = strMo2954.substring(3);
                            abstractC22044M49858 = abstractC22044M49858.m49858();
                        } else {
                            str = abstractC22044M49858.m49876(strMo2954).mo4294();
                            break;
                        }
                    } else {
                        str = abstractC22044M35193.mo4294();
                        break;
                    }
                }
            } else {
                str = strMo2954;
            }
            if (str == null) {
                throw new C12893();
            }
        }
        throw new IOException("Too many symbolic links in hex target");
    }

    public C1442(String str, C10390 c10390, C6597 c6597) {
        this.f5052 = str;
        this.f5053 = c10390.f33036;
        AbstractC22044 abstractC22044 = c10390.f33035;
        this.f5055 = abstractC22044;
        this.f5056 = c6597;
        this.f5054 = abstractC22044.m49833();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1442 m5187(AbstractC22044 abstractC22044) {
        C17359.requireNonNull(abstractC22044, "openedFile");
        if (abstractC22044.m49833()) {
            return m5183(abstractC22044);
        }
        return m5182(abstractC22044.mo4294(), (String) null, (C6597) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1442 m5184(AbstractC22044 abstractC22044, String str, C6597 c6597) {
        C17359.requireNonNull(abstractC22044, "openedFile");
        if (abstractC22044.m49833()) {
            return m5183(abstractC22044);
        }
        return m5182(abstractC22044.mo4294(), str, c6597);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C1442 m5188(AbstractC22044 abstractC22044, String str, C6597 c6597) throws IOException {
        C17359.requireNonNull(abstractC22044, "openedFile");
        if (!abstractC22044.m49833()) {
            try {
                return new C1442(abstractC22044.mo4294(), new C10390(C14584.m35193(str, new String[0]), str), c6597);
            } catch (RuntimeException e) {
                throw new IOException("Unable to restore deferred hex target", e);
            }
        }
        return m5183(abstractC22044);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m5189() {
        return this.f5052;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m5190() {
        return this.f5053;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m5193() {
        return this.f5055;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6597 m5194() {
        return this.f5056;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m5191() throws IOException {
        C6597 c6597 = this.f5056;
        if (this.f5054) {
            return;
        }
        try {
            C10390 c10390M5186 = m5186(this.f5052, true);
            if (!this.f5053.equals(c10390M5186.f33036)) {
                throw new C12893();
            }
            if (!c6597.equals(m5185(c10390M5186.f33035, c6597))) {
                throw new C12893();
            }
        } catch (C12893 e) {
            throw e;
        } catch (IOException e2) {
            throw new IOException("Unable to validate hex target", e2);
        } catch (RuntimeException e3) {
            throw new IOException("Unable to validate hex target", e3);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1442 m5183(AbstractC22044 abstractC22044) {
        return new C1442(abstractC22044.mo4294(), new C10390(abstractC22044, abstractC22044.mo4278()), f5050);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1442 m5182(String str, String str2, C6597 c6597) throws IOException {
        C10390 c10390M5186 = m5186(str, false);
        String str3 = c10390M5186.f33036;
        AbstractC22044 abstractC22044 = c10390M5186.f33035;
        if (abstractC22044.m49833()) {
            return new C1442(str, c10390M5186, f5050);
        }
        if (str2 != null && !str2.equals(str3)) {
            throw new C12893();
        }
        if (!abstractC22044.mo4297() || !abstractC22044.mo4304()) {
            throw new IOException("File can not be read");
        }
        long jMo4285 = abstractC22044.mo4285();
        if (jMo4285 < 0) {
            throw new IOException("Hex target length is unavailable");
        }
        C6597 c6598 = new C6597(jMo4285, abstractC22044.mo4286());
        if (c6597 != null && !c6597.equals(c6598)) {
            throw new C12893();
        }
        C10390 c10390M5187 = m5186(str, false);
        if (str3.equals(c10390M5187.f33036)) {
            AbstractC22044 abstractC22045 = c10390M5187.f33035;
            if (abstractC22045.mo4297() && abstractC22045.mo4304() && abstractC22045.mo4285() == c6598.m18524() && abstractC22045.mo4286() == c6598.m18522()) {
                return new C1442(str, c10390M5187, c6598);
            }
        }
        throw new C12893();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6597 m5185(AbstractC22044 abstractC22044, C6597 c6597) throws IOException {
        if (!(abstractC22044 instanceof C7302)) {
            if (!abstractC22044.mo4297() || !abstractC22044.mo4304()) {
                throw new IOException("Hex target metadata is unavailable");
            }
            long jMo4285 = abstractC22044.mo4285();
            long jMo4286 = abstractC22044.mo4286();
            if (jMo4285 < 0 || ((jMo4285 == 0 && c6597.m18524() != 0) || (jMo4286 == 0 && c6597.m18522() != 0))) {
                throw new IOException("Hex target metadata is unavailable");
            }
            return new C6597(jMo4285, jMo4286);
        }
        C21694 c21694M19978 = ((C7302) abstractC22044).m19978();
        if (c21694M19978.m49239() != '-' || c21694M19978.m49232() < 0) {
            throw new IOException("Hex target metadata is unavailable");
        }
        return new C6597(c21694M19978.m49232(), c21694M19978.m49236());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1442 m5192() {
        if (this.f5054) {
            return this;
        }
        return m5182(this.f5052, this.f5053, (C6597) null);
    }
}
