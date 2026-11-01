package l;

/* JADX INFO: renamed from: l.᩷ᩳ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 37RB */
/* JADX INFO: loaded from: classes5.dex */
public class C21035 extends C20330 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f68514;

    public C21035(EnumC0573 enumC0573, int i, int i2, String str, C21825 c21825) {
        super(enumC0573, i, i2, c21825);
        this.f68514 = str;
    }

    @Override // l.C20330
    /* JADX INFO: renamed from: ۙ */
    public void mo20176() {
        EnumC16097 enumC16097 = this.f65849.f2498;
        EnumC16097 enumC16098 = EnumC16097.STRING;
        if (enumC16097 == enumC16098) {
            return;
        }
        throw new AssertionError("Bad token kind - expected " + enumC16098);
    }

    @Override // l.C20330
    /* JADX INFO: renamed from: ᩹ */
    public final String mo45897() {
        return this.f68514;
    }
}
