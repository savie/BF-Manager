package l;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.ۗۤۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z556 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3345 extends C2161 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10923;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3345(Writer writer, boolean z) {
        super(writer);
        this.f10923 = z;
    }

    @Override // l.C2161
    /* JADX INFO: renamed from: ۙ */
    public final void mo7436(EnumC22631 enumC22631) throws IOException {
        if (enumC22631 == EnumC22631.f73418) {
            enumC22631 = EnumC22631.f73506;
        } else if (enumC22631 == EnumC22631.f73446 || enumC22631 == EnumC22631.f73398) {
            enumC22631 = EnumC22631.f73478;
        }
        super.mo7436(enumC22631);
    }

    @Override // l.C2161
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7441(long j) throws IOException {
        if (this.f10923 && 2130706432 <= j && j <= 2147483647L) {
            super.mo7441(2130706432L);
        } else {
            super.mo7441(j);
        }
    }
}
