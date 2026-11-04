package l;

import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: l.᩸᩷ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes.dex */
public final class C23072 extends AbstractC18217 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20088 f74847;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17850 f74848;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0318 f74849;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23072(C20088 c20088, C17850 c17850, C17850 c17851, C0318 c0318) {
        super(c17850);
        this.f74847 = c20088;
        this.f74848 = c17851;
        this.f74849 = c0318;
    }

    @Override // l.AbstractC18217
    /* JADX INFO: renamed from: ۙ */
    public final void mo2000() {
        super.mo2000();
        String strM41698 = this.f74848.m41698();
        try {
            byte[] bArrM2010 = this.f74849.m2010();
            try {
                synchronized (this.f74847.f64565) {
                    this.f74847.f64565.putNextEntry(new ZipEntry(strM41698 + ".class"));
                    this.f74847.f64565.write(bArrM2010);
                    this.f74847.f64565.closeEntry();
                }
            } catch (IOException e) {
                throw new C16601(e);
            }
        } catch (Throwable th) {
            throw new C16601(C25272.m56409("ASM fail to generate .class file: ", strM41698), th);
        }
    }
}
