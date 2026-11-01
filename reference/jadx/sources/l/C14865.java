package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X8F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14865 extends AbstractC9677 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f48565;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6397 f48566;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f48567;

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۨ */
    public final String mo15077() {
        return "compress";
    }

    public C14865(String str) {
        this.f48567 = C5553.m15313(str, new String[0]);
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo10267(boolean z) {
        long jM36613;
        EnumC15300 enumC15300;
        AbstractC20745 abstractC20745 = this.f48567;
        C1388 c1388M46710 = abstractC20745.m46710("r");
        try {
            byte[] bArrM36612 = EnumC15300.m36612();
            int i = 0;
            int iMo4867 = c1388M46710.mo4867(0, bArrM36612.length, bArrM36612);
            String strM46718 = abstractC20745.m46718();
            long jMo33964 = abstractC20745.mo33964();
            long jMo33991 = abstractC20745.mo33991();
            EnumC15300[] enumC15300ArrValues = EnumC15300.values();
            int length = enumC15300ArrValues.length;
            while (true) {
                if (i >= length) {
                    jM36613 = -1;
                    enumC15300 = null;
                    break;
                }
                EnumC15300 enumC15301 = enumC15300ArrValues[i];
                if (enumC15301.m36616(bArrM36612, iMo4867)) {
                    jM36613 = enumC15301.m36613(c1388M46710);
                    enumC15300 = enumC15301;
                    break;
                }
                i++;
            }
            long j = jM36613;
            if (enumC15300 == null) {
                throw new IOException("Unknown format file: " + abstractC20745.mo33986());
            }
            this.f48566 = new C6397(strM46718, j, jMo33964, jMo33991, enumC15300);
            this.f48565 = jMo33991;
            c1388M46710.close();
        } catch (Throwable th) {
            try {
                c1388M46710.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InputStream mo15073(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557) throws IOException {
        InputStream inputStreamMo33970 = this.f48567.mo33970();
        try {
            return ((C6397) interfaceC2557).m17543().m36614(inputStreamMo33970);
        } catch (IOException e) {
            inputStreamMo33970.close();
            throw e;
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final C8141 mo24616(InterfaceC2557 interfaceC2557) throws IOException {
        AbstractC20745 abstractC20745 = this.f48567;
        C8516 c8516 = new C8516(abstractC20745.mo33964());
        C24037 c24037 = new C24037(abstractC20745.mo33970(), c8516);
        try {
            return new C8141(((C6397) interfaceC2557).m17543().m36614(c24037), c8516, false);
        } catch (IOException e) {
            c24037.close();
            throw e;
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo24618(AbstractActivityC12483 abstractActivityC12483, InterfaceC2557 interfaceC2557, InterfaceC12086 interfaceC12086) throws IOException {
        C8141 c8141Mo24616 = mo24616(interfaceC2557);
        try {
            c8141Mo24616.m21449().m22241(new C2849(interfaceC12086));
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            do {
                int i = c8141Mo24616.read(bArr);
                if (i == -1) {
                    c8141Mo24616.close();
                    return;
                }
                interfaceC12086.mo30075(i, bArr);
            } while (!interfaceC12086.mo2357());
            c8141Mo24616.close();
        } catch (Throwable th) {
            try {
                c8141Mo24616.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2557 mo10264(String str) {
        if (this.f48566 == null) {
            mo10267(false);
        }
        C6397 c6397 = this.f48566;
        if (c6397 == null || !str.equals(c6397.getPath())) {
            return null;
        }
        return this.f48566;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15074(MessageDigest messageDigest) {
        messageDigest.update("compress".getBytes());
        C22253.m49418(messageDigest, this.f48567.mo33986());
        messageDigest.update(String.valueOf(this.f48565).getBytes());
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo10263(String str, boolean z) {
        if (this.f48566 == null) {
            mo10267(false);
        }
        ArrayList arrayList = new ArrayList(2);
        if (this.f48566 != null && (str.isEmpty() || str.equals("/"))) {
            arrayList.add(this.f48566);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6397 m35543() {
        return this.f48566;
    }

    @Override // l.AbstractC9677
    /* JADX INFO: renamed from: ۙ */
    public final void mo15075(C11018 c11018) {
        c11018.m27786(this.f48567.mo33986());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m35545() {
        return this.f48567.mo33986();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m35542() {
        return this.f48567;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m35541() {
        return this.f48565 != this.f48567.mo33991();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m35544() {
        return this.f48567.mo33975();
    }
}
