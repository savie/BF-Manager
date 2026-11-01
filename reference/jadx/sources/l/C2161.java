package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.֫᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2161 extends C12283 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7837;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2161(Writer writer, boolean z) {
        super(writer);
        this.f7837 = z;
    }

    @Override // l.C12283
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6725(EnumC10297 enumC10297) throws IOException {
        if (enumC10297 == EnumC10297.f35225) {
            enumC10297 = EnumC10297.f35313;
        } else if (enumC10297 == EnumC10297.f35108 || enumC10297 == EnumC10297.f35303) {
            enumC10297 = EnumC10297.f35076;
        }
        super.mo6725(enumC10297);
    }

    @Override // l.C12283
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo6726(long j) throws IOException {
        if (this.f7837 && 2130706432 <= j && j <= 2147483647L) {
            super.mo6726(2130706432L);
        } else {
            super.mo6726(j);
        }
    }
}
