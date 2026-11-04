package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۬᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14177 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f44828 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15252 f44829;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C13477 f44827 = new C13477();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C8957 f44826 = new C8957(EnumC7466.f24604, 0, 0, null);

    public C14177(C4747 c4747) {
        c4747.m14646(f44827, this);
        this.f44829 = C15252.m36599(c4747);
        for (EnumC7466 enumC7466 : EnumC7466.values()) {
            String str = enumC7466.f24714;
            if (str != null) {
                this.f44829.f49864.m51194(str);
                this.f44828.put(enumC7466.f24714, enumC7466);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7466 m34466(AbstractC19728 abstractC19728) {
        EnumC7466 enumC7466 = (EnumC7466) this.f44828.get(abstractC19728.toString());
        return enumC7466 != null ? enumC7466 : EnumC7466.f24655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7466 m34465(String str) {
        EnumC7466 enumC7466 = (EnumC7466) this.f44828.get(str);
        return enumC7466 != null ? enumC7466 : EnumC7466.f24655;
    }
}
