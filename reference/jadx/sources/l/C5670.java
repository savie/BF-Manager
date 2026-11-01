package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۚ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5670 extends C12021 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f19348;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f19349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC22146[] f19350;

    @Override // l.C15091, l.InterfaceC2389
    public final /* bridge */ /* synthetic */ EnumC11563 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        mo15561((InterfaceC3800) obj, iOException);
        return EnumC11563.CONTINUE;
    }

    @Override // l.C15091, l.InterfaceC2389
    public final EnumC11563 visitFile(Object obj, InterfaceC20735 interfaceC20735) throws IOException {
        InterfaceC3800 interfaceC3800 = (InterfaceC3800) obj;
        InterfaceC2847[] interfaceC2847Arr = C22604.f73658;
        InterfaceC3800 fileName = interfaceC3800 != null ? interfaceC3800.getFileName() : null;
        if (Arrays.binarySearch(this.f19349, fileName != null ? fileName.toString() : null) < 0) {
            EnumC22146[] enumC22146Arr = this.f19350;
            if (C5212.exists(interfaceC3800, enumC22146Arr)) {
                if (this.f19348) {
                    C22604.m50104(interfaceC3800, enumC22146Arr);
                }
                C5212.deleteIfExists(interfaceC3800);
            }
            if (C5212.isSymbolicLink(interfaceC3800)) {
                try {
                    C5212.delete(interfaceC3800);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        m29921(interfaceC20735);
        EnumC11563 enumC11563 = EnumC11563.CONTINUE;
        return EnumC11563.CONTINUE;
    }

    @Override // l.C12021
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || C5670.class != obj.getClass()) {
            return false;
        }
        C5670 c5670 = (C5670) obj;
        return this.f19348 == c5670.f19348 && Arrays.equals(this.f19349, c5670.f19349);
    }

    @Override // l.C12021
    public final int hashCode() {
        return C13638.hash(Boolean.valueOf(this.f19348)) + (((super.hashCode() * 31) + Arrays.hashCode(this.f19349)) * 31);
    }

    @Override // l.C12021
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo15561(InterfaceC3800 interfaceC3800, IOException iOException) throws IOException {
        InterfaceC2847[] interfaceC2847Arr = C22604.f73658;
        DirectoryStream directoryStreamNewDirectoryStream = C5212.newDirectoryStream(interfaceC3800);
        try {
            boolean zHasNext = directoryStreamNewDirectoryStream.iterator().hasNext();
            directoryStreamNewDirectoryStream.close();
            if (!zHasNext) {
                C5212.deleteIfExists(interfaceC3800);
            }
            super.mo15561(interfaceC3800, iOException);
            EnumC11563 enumC11563 = EnumC11563.CONTINUE;
        } catch (Throwable th) {
            if (directoryStreamNewDirectoryStream != null) {
                try {
                    directoryStreamNewDirectoryStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.C15091, l.InterfaceC2389
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final EnumC11563 preVisitDirectory(InterfaceC3800 interfaceC3800, InterfaceC20735 interfaceC20735) {
        super.preVisitDirectory(interfaceC3800, interfaceC20735);
        InterfaceC2847[] interfaceC2847Arr = C22604.f73658;
        InterfaceC3800 fileName = interfaceC3800 != null ? interfaceC3800.getFileName() : null;
        return Arrays.binarySearch(this.f19349, fileName != null ? fileName.toString() : null) < 0 ? EnumC11563.CONTINUE : EnumC11563.SKIP_SUBTREE;
    }

    public C5670(InterfaceC9427 interfaceC9427, EnumC22146[] enumC22146Arr, InterfaceC2847[] interfaceC2847Arr, String... strArr) {
        EnumC22146[] enumC22146Arr2;
        C14138 c14138 = new C14138();
        c14138.m13763(interfaceC9427);
        super(c14138);
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f19349 = strArr2;
        this.f19348 = EnumC7081.m18955(interfaceC2847Arr);
        if (enumC22146Arr != null) {
            enumC22146Arr2 = (EnumC22146[]) enumC22146Arr.clone();
        } else {
            enumC22146Arr2 = (EnumC22146[]) C22604.f73657.clone();
        }
        this.f19350 = enumC22146Arr2;
    }
}
