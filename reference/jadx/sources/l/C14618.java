package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes5.dex */
public class C14618 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC13127 f46036;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C7660 f46037;

    /* JADX INFO: renamed from: ᩷ */
    public int mo1603() {
        return 0;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    public C14618(C15291 c15291, EnumC13127 enumC13127) {
        this.f46036 = enumC13127;
        this.f46037 = c15291.m36704(enumC13127.m32610());
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC3359 mo7367(C15291 c15291) {
        C7660 c7660M36707;
        if (this instanceof C1195) {
            C1195 c1195 = (C1195) this;
            C7660 c7660 = c1195.f4357;
            if (!c7660.mo20871() && c7660.m20873() == EnumC3185.f10363 && this.f46036.m32606() == EnumC3185.f10335) {
                C15867 c15867FindFirst = C1170.stream(c15291.f49996.values()).filter(new C14676(2, c7660)).findFirst();
                if (c15867FindFirst.isPresent()) {
                    c7660M36707 = (C7660) c15867FindFirst.get();
                } else {
                    c7660M36707 = c15291.m36707((AbstractC18847) new C22005((C7660) c7660.f25232.f61224));
                }
                c1195.f4357 = c7660M36707;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7660 mo35261(C7660 c7660, C15291 c15291) {
        if (C4178.f14170[c7660.m20873().ordinal()] != 2 || this.f46036.m32606() != EnumC3185.f10346) {
            return c7660;
        }
        C15867 c15867FindAny = C1170.stream(c15291.f49996.values()).filter(new C24316(0, c7660)).findAny();
        if (c15867FindAny.isPresent()) {
            return (C7660) c15867FindAny.get();
        }
        return c15291.m36707((AbstractC18847) new C24572(c7660));
    }

    @Override // l.InterfaceC3359
    public int getLength() {
        return mo1603() + 6;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(this.f46037.f67820);
        c11388.m28741(mo1603());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC13127 m35262() {
        return this.f46036;
    }
}
