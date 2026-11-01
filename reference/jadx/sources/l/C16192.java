package l;

import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: l.ܺ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes4.dex */
public final class C16192 extends AbstractC0764 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12760 f52284;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14781 f52285;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20425 f52286;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16192(C20425 c20425, C14781 c14781, C14781 c14782, C12760 c12760) {
        super(c14781);
        this.f52286 = c20425;
        this.f52285 = c14782;
        this.f52284 = c12760;
    }

    @Override // l.AbstractC0764
    /* JADX INFO: renamed from: ۙ */
    public final void mo3284() {
        super.mo3284();
        String strM35421 = this.f52285.m35421();
        try {
            byte[] bArrM31713 = this.f52284.m31713();
            try {
                synchronized (this.f52286.f66204) {
                    this.f52286.f66204.putNextEntry(new ZipEntry(strM35421 + ".class"));
                    this.f52286.f66204.write(bArrM31713);
                    this.f52286.f66204.closeEntry();
                }
            } catch (IOException e) {
                throw new C23560(e);
            }
        } catch (Throwable th) {
            throw new C23560(C0252.m1693("ASM fail to generate .class file: ", strM35421), th);
        }
    }
}
