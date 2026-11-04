package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAQ1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24604 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20283 f79704;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6707 f79705;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f79703 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6704 f79702 = new C6704(0, this);

    public C24604(C20283 c20283) {
        this.f79704 = c20283;
        try {
            this.f79705 = C6707.m18719();
        } catch (IOException e) {
            throw new IllegalStateException("Cannot load platform class set", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4466 m54927(String str) {
        if (str.length() <= 2) {
            return null;
        }
        return (C4466) C23217.computeIfAbsent(this.f79703, str, this.f79702);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4466 m54926(C24604 c24604, String str) {
        InterfaceC14906 interfaceC14906M46618 = c24604.f79704.m46618(C1402.m5124(1, 1, str));
        if (interfaceC14906M46618 != null) {
            C22737 c22737Mo10207 = ((C3129) interfaceC14906M46618).mo10207();
            if (c22737Mo10207 == null) {
                return null;
            }
            return new C4466(c22737Mo10207);
        }
        try {
            C3723 c3723M18722 = c24604.f79705.m18722(str);
            if (c3723M18722 == null) {
                return null;
            }
            return new C4466(c3723M18722);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read platform class: ".concat(str), e);
        }
    }
}
