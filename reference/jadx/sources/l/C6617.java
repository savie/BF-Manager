package l;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6617 extends C20787 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String[] f22113;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f22114;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC20599[] f22115;

    @Override // l.C21345, l.InterfaceC23583
    public final /* bridge */ /* synthetic */ EnumC16123 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        mo18549((InterfaceC24329) obj, iOException);
        return EnumC16123.CONTINUE;
    }

    @Override // l.C21345, l.InterfaceC23583
    public final EnumC16123 visitFile(Object obj, InterfaceC8665 interfaceC8665) throws IOException {
        InterfaceC24329 interfaceC24329 = (InterfaceC24329) obj;
        InterfaceC12582[] interfaceC12582Arr = C24517.f79500;
        InterfaceC24329 fileName = interfaceC24329 != null ? interfaceC24329.getFileName() : null;
        if (Arrays.binarySearch(this.f22113, fileName != null ? fileName.toString() : null) < 0) {
            EnumC20599[] enumC20599Arr = this.f22115;
            if (C3445.exists(interfaceC24329, enumC20599Arr)) {
                if (this.f22114) {
                    C24517.m54778(interfaceC24329, enumC20599Arr);
                }
                C3445.deleteIfExists(interfaceC24329);
            }
            if (C3445.isSymbolicLink(interfaceC24329)) {
                try {
                    C3445.delete(interfaceC24329);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        m47572(interfaceC8665);
        EnumC16123 enumC16123 = EnumC16123.CONTINUE;
        return EnumC16123.CONTINUE;
    }

    @Override // l.C20787
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || C6617.class != obj.getClass()) {
            return false;
        }
        C6617 c6617 = (C6617) obj;
        return this.f22114 == c6617.f22114 && Arrays.equals(this.f22113, c6617.f22113);
    }

    @Override // l.C20787
    public final int hashCode() {
        return C17359.hash(Boolean.valueOf(this.f22114)) + (((super.hashCode() * 31) + Arrays.hashCode(this.f22113)) * 31);
    }

    @Override // l.C20787
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18549(InterfaceC24329 interfaceC24329, IOException iOException) throws IOException {
        InterfaceC12582[] interfaceC12582Arr = C24517.f79500;
        DirectoryStream directoryStreamNewDirectoryStream = C3445.newDirectoryStream(interfaceC24329);
        try {
            boolean zHasNext = directoryStreamNewDirectoryStream.iterator().hasNext();
            directoryStreamNewDirectoryStream.close();
            if (!zHasNext) {
                C3445.deleteIfExists(interfaceC24329);
            }
            super.mo18549(interfaceC24329, iOException);
            EnumC16123 enumC16123 = EnumC16123.CONTINUE;
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

    @Override // l.C21345, l.InterfaceC23583
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final EnumC16123 preVisitDirectory(InterfaceC24329 interfaceC24329, InterfaceC8665 interfaceC8665) {
        super.preVisitDirectory(interfaceC24329, interfaceC8665);
        InterfaceC12582[] interfaceC12582Arr = C24517.f79500;
        InterfaceC24329 fileName = interfaceC24329 != null ? interfaceC24329.getFileName() : null;
        return Arrays.binarySearch(this.f22113, fileName != null ? fileName.toString() : null) < 0 ? EnumC16123.CONTINUE : EnumC16123.SKIP_SUBTREE;
    }

    public C6617(InterfaceC17803 interfaceC17803, EnumC20599[] enumC20599Arr, InterfaceC12582[] interfaceC12582Arr, String... strArr) {
        EnumC20599[] enumC20599Arr2;
        C3633 c3633 = new C3633();
        c3633.m53051(interfaceC17803);
        super(c3633);
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f22113 = strArr2;
        this.f22114 = EnumC21533.m48976(interfaceC12582Arr);
        if (enumC20599Arr != null) {
            enumC20599Arr2 = (EnumC20599[]) enumC20599Arr.clone();
        } else {
            enumC20599Arr2 = (EnumC20599[]) C24517.f79504.clone();
        }
        this.f22115 = enumC20599Arr2;
    }
}
