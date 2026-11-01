package l;

import android.content.UriPermission;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17196 extends AbstractC20745 implements InterfaceC16034 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static String f54823 = "";

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C16491 f54828;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f54829;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C13357 f54830;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f54831;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final File f54832;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2772 f54833;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C0262 f54822 = new C0262();

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final C9186 f54827 = new C9186();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C22959 f54824 = C22959.m50799(2000);

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static String f54826 = "";

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final HashMap f54825 = new HashMap();

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo33972() {
        return false;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17196 mo40129() {
        return this;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo33985() {
        return true;
    }

    static {
        if (C5553.m15326()) {
            return;
        }
        if (C5553.m15303() || C14063.m34014()) {
            String string = C22529.m50043(C5553.m15303() ? "primary:\u200bAndroid" : "primary:Android/", false).toString();
            C13465.m32967(string, "toString(...)");
            List<UriPermission> persistedUriPermissions = C16737.m39277().getContentResolver().getPersistedUriPermissions();
            C13465.m32967(persistedUriPermissions, "getPersistedUriPermissions(...)");
            for (UriPermission uriPermission : persistedUriPermissions) {
                if (uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                    Uri uri = uriPermission.getUri();
                    String string2 = uri.toString();
                    C13465.m32967(string2, "toString(...)");
                    if (string2.startsWith(string)) {
                        String str = uri.getPathSegments().get(1);
                        C13465.m32967(str, "get(...)");
                        String strSubstring = str.substring(8);
                        C13465.m32967(strSubstring, "substring(...)");
                        f54825.put(strSubstring, uri);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ */
    public final ParcelFileDescriptor mo33981(String str) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorMo33981;
        C13465.m32966(str, "mode");
        try {
            return this.f54833.mo33981(str);
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 == null || (parcelFileDescriptorMo33981 = c13357M40120.mo33981(str)) == null) {
                throw new IOException("Permission denied: ".concat(mo33986()));
            }
            return parcelFileDescriptorMo33981;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo24646(AbstractC20745 abstractC20745) {
        C13357 c13357M40120;
        C13465.m32966(abstractC20745, "tar");
        try {
            return this.f54833.mo24646(abstractC20745 instanceof C17196 ? ((C17196) abstractC20745).f54833 : abstractC20745);
        } catch (C5595 unused) {
            C13357 c13357M40121 = m40120();
            if (c13357M40121 == null) {
                return false;
            }
            if ((abstractC20745 instanceof C17196) && (c13357M40120 = ((C17196) abstractC20745).m40120()) != null) {
                abstractC20745 = c13357M40120;
            }
            return c13357M40121.mo24646(abstractC20745);
        }
    }

    public C17196(File file, String str, String str2, C2772 c2772, C16491 c16491) {
        C13465.m32966(file, "file");
        C13465.m32966(str, "relativePath");
        C13465.m32966(str2, "treePrimaryPath");
        this.f54832 = file;
        this.f54829 = str;
        this.f54831 = str2;
        this.f54833 = c2772;
        this.f54828 = c16491;
    }

    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public final String m40128() {
        return this.f54831;
    }

    /* JADX INFO: renamed from: ܳܰ, reason: not valid java name and contains not printable characters */
    private final C13357 m40120() {
        C13357 c13357 = this.f54830;
        if (c13357 != null) {
            return c13357;
        }
        String str = this.f54831;
        if (!C0262.m1763(str)) {
            return null;
        }
        C13357 c13358 = new C13357(this.f54832, new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str)).appendPath("document").appendPath("primary:" + this.f54829).build());
        this.f54830 = c13358;
        return c13358;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo32856() {
        return C19812.m45045().mo43869();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo32858() {
        return C19812.m45045().mo43869();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17196(File file, String str, String str2) {
        this(file, str, str2, new C2772(file, C19812.m45045().mo43871() ? new File(C7997.m21055("/data/media/", C11904.f39934.getName(), "/", str)) : file, str, str2), null);
        C13465.m32966(str, "relativePath");
        C13465.m32966(str2, "treePrimaryPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17196(File file, String str, String str2, C16491 c16491) {
        this(file, str, str2, new C2772(file, C19812.m45045().mo43871() ? new File(C7997.m21055("/data/media/", C11904.f39934.getName(), "/", str)) : file, str, str2), c16491);
        C13465.m32966(file, "file");
        C13465.m32966(str, "relativePath");
        C13465.m32966(str2, "treePrimaryPath");
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC20745 mo24641() {
        File absoluteFile = this.f54832.getAbsoluteFile();
        C13465.m32967(absoluteFile, "getAbsoluteFile(...)");
        return new C17196(absoluteFile, this.f54829, this.f54831, this.f54828);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo24643() {
        String absolutePath = this.f54832.getAbsolutePath();
        C13465.m32967(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // l.InterfaceC16034
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC20745 mo8445() {
        C2772 c2772 = this.f54833;
        if (c2772 instanceof C11946) {
            return this;
        }
        return new C17196(this.f54832, this.f54829, this.f54831, c2772.mo8445(), this.f54828);
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo33978() {
        try {
            f54822.getClass();
            return this.f54833.mo33978();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33978();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo33987() {
        try {
            f54822.getClass();
            return this.f54833.mo33987();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33987();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    public final String getName() {
        String name = this.f54832.getName();
        C13465.m32967(name, "getName(...)");
        return name;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܶۙ */
    public final String mo33986() {
        String path = this.f54832.getPath();
        C13465.m32967(path, "getPath(...)");
        return path;
    }

    @Override // l.AbstractC20745
    public final String getParent() {
        return this.f54832.getParent();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24647() {
        try {
            f54822.getClass();
            return this.f54833.mo24647();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo24647();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo24644() {
        try {
            f54822.getClass();
            return this.f54833.mo24644();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo24647();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo33975() {
        try {
            f54822.getClass();
            return this.f54833.mo33975();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33975();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ۙ */
    public final boolean mo33971() {
        C16491 c16491 = this.f54828;
        if (c16491 != null) {
            return !c16491.m38765();
        }
        try {
            f54822.getClass();
            return this.f54833.mo33971();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33971();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo33974() {
        C16491 c16491 = this.f54828;
        if (c16491 != null) {
            return c16491.m38765();
        }
        try {
            f54822.getClass();
            return this.f54833.mo33974();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33974();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩵ۙ */
    public final boolean mo33988() {
        if (this.f54828 != null) {
            return true;
        }
        try {
            return this.f54833.mo33988();
        } catch (C5595 unused) {
            return m40120() != null;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ֫ۙ */
    public final long mo33964() {
        C16491 c16491 = this.f54828;
        if (c16491 != null) {
            return c16491.m38766();
        }
        try {
            return this.f54833.mo33964();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33964();
            }
            return -1L;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩻ۙ */
    public final long mo33991() {
        C16491 c16491 = this.f54828;
        if (c16491 != null) {
            return c16491.m38764();
        }
        try {
            return this.f54833.mo33991();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33991();
            }
            return 0L;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo32855(long j) {
        if (j < 0) {
            return false;
        }
        try {
            f54822.getClass();
            return this.f54833.mo32855(j);
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            return c13357M40120 != null ? c13357M40120.mo32855(j) : false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۤܰ */
    public final boolean mo8448() {
        try {
            f54822.getClass();
            this.f54833.mo8448();
            return true;
        } catch (C5595 unused) {
            return m40120() != null;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo8449() {
        try {
            f54822.getClass();
            return this.f54833.mo8449();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo8449();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo8447() {
        try {
            return this.f54833.mo8447();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo8447();
            }
            return false;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3810 mo8444(InterfaceC12984 interfaceC12984) {
        try {
            return this.f54833.mo8444(interfaceC12984);
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            return c13357M40120 != null ? c13357M40120.mo8444(interfaceC12984) : super.mo8444(interfaceC12984);
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public final List mo33983(boolean z) {
        ArrayList arrayList;
        File file = this.f54832;
        String str = this.f54829;
        try {
            List listMo33983 = this.f54833.mo33983(z);
            if (Build.VERSION.SDK_INT >= 34 && C19812.m45045().mo43870() && (C12529.m31138(str, "Android/data") || C12529.m31138(str, "Android/obb"))) {
                for (String str2 : C10141.m25762((Set) C9030.stream(listMo33983).map(new C14566(new C20724())).collect(C1890.toSet()), str)) {
                    String str3 = str + "/" + str2;
                    listMo33983.add(new C17196(new File(file, str2), str3, str3));
                }
            }
            C13465.m32962(listMo33983);
            return listMo33983;
        } catch (C5595 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C12529.m31138(str, "Android/data")) {
                    ArrayList arrayListM21124 = i == 33 ? C8024.m21124(this) : C8730.m22592(this);
                    if (mo33986().equals(f54823)) {
                        C0262.m1761(str);
                    }
                    return arrayListM21124;
                }
                if (C12529.m31138(str, "Android/obb")) {
                    ArrayList arrayListM21128 = i == 33 ? C8024.m21128(this) : C8730.m22596(this);
                    if (mo33986().equals(f54823)) {
                        C0262.m1761(str);
                    }
                    return arrayListM21128;
                }
            }
            C13357 c13357M40120 = m40120();
            String str4 = this.f54831;
            if (c13357M40120 == null) {
                if (mo33986().equals(f54823)) {
                    C0262.m1761(str4);
                }
                return new ArrayList();
            }
            List listMo33984 = c13357M40120.mo33983(z);
            ArrayList arrayList2 = new ArrayList(C4892.m13614((Iterable) listMo33984));
            for (AbstractC20745 abstractC20745 : (ArrayList) listMo33984) {
                String name = abstractC20745.getName();
                C17196 c17196 = new C17196(new File(file, name), C1679.m5594(str, "/", name), str4);
                c17196.f54830 = (C13357) abstractC20745;
                arrayList2.add(c17196);
            }
            C13465.m32966(arrayList2, "<this>");
            boolean z2 = arrayList2 instanceof Collection;
            if (z2) {
                ArrayList arrayList3 = arrayList2;
                int size = arrayList3.size();
                if (size != 0) {
                    if (size != 1) {
                        return new ArrayList(arrayList3);
                    }
                    return C4892.m13617(arrayList2 instanceof List ? arrayList2.get(0) : arrayList3.iterator().next());
                }
            } else {
                if (z2) {
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    C13465.m32966(arrayList2, "<this>");
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
                int size2 = arrayList.size();
                if (size2 != 0) {
                    return size2 != 1 ? arrayList : C4892.m13617(arrayList.get(0));
                }
            }
            return C23238.f75405;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۢۙ */
    public final List mo33973() {
        String str = this.f54829;
        try {
            List listMo33973 = this.f54833.mo33973();
            if (Build.VERSION.SDK_INT >= 34 && C19812.m45045().mo43870() && (C12529.m31138(str, "Android/data") || C12529.m31138(str, "Android/obb"))) {
                List listM25762 = C10141.m25762(new HashSet(listMo33973), str);
                C13465.m32962(listM25762);
                listMo33973.addAll(listM25762);
            }
            C13465.m32962(listMo33973);
            return listMo33973;
        } catch (C5595 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C12529.m31138(str, "Android/data")) {
                    if (mo33986().equals(f54823)) {
                        C0262.m1761(str);
                    }
                    if (i == 33) {
                        return C8024.m21122();
                    }
                    return C8730.m22590();
                }
                if (C12529.m31138(str, "Android/obb")) {
                    if (mo33986().equals(f54823)) {
                        C0262.m1761(str);
                    }
                    if (i == 33) {
                        return C8024.m21126();
                    }
                    return C8730.m22594();
                }
            }
            C13357 c13357M40120 = m40120();
            if (c13357M40120 == null) {
                if (mo33986().equals(f54823)) {
                    C0262.m1761(this.f54831);
                }
                return new ArrayList();
            }
            List listMo33974 = c13357M40120.mo33973();
            C13465.m32962(listMo33974);
            return listMo33974;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۜܰ */
    public final InputStream mo33970() throws IOException {
        InputStream inputStreamMo33970;
        try {
            f54822.getClass();
            return this.f54833.mo33970();
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 == null || (inputStreamMo33970 = c13357M40120.mo33970()) == null) {
                throw new IOException("Permission denied: ".concat(mo33986()));
            }
            return inputStreamMo33970;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨ */
    public final OutputStream mo33976(boolean z) throws IOException {
        OutputStream outputStreamMo33976;
        try {
            return this.f54833.mo33976(z);
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 == null || (outputStreamMo33976 = c13357M40120.mo33976(z)) == null) {
                throw new IOException("Permission denied: ".concat(mo33986()));
            }
            return outputStreamMo33976;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۬ܰ */
    public final FileChannel mo33982() throws IOException {
        try {
            FileChannel fileChannelMo33982 = this.f54833.mo33982();
            C13465.m32962(fileChannelMo33982);
            return fileChannelMo33982;
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 == null) {
                throw new IOException("Permission denied: ".concat(mo33986()));
            }
            c13357M40120.mo33982();
            throw null;
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC21850 mo33966(String str) throws IOException {
        try {
            return this.f54833.mo33966(str);
        } catch (C5595 unused) {
            C13357 c13357M40120 = m40120();
            if (c13357M40120 != null) {
                return c13357M40120.mo33966(str);
            }
            throw new IOException("Permission denied: ".concat(mo33986()));
        }
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo40126() {
        return (C19812.m45045().mo43869() || m40120() == null) ? false : true;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final Uri mo40127() {
        if (!mo40126()) {
            throw new UnsupportedOperationException();
        }
        C13357 c13357M40120 = m40120();
        C13465.m32962(c13357M40120);
        Uri uriMo40127 = c13357M40120.mo40127();
        C13465.m32967(uriMo40127, "getContentUri(...)");
        return uriMo40127;
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final C14042 m40125() {
        if (C19812.m45045().mo43869()) {
            return this.f54833;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20745 m40115(C17196 c17196) {
        C14042 c14042M40125 = c17196.m40125();
        return c14042M40125 != null ? c14042M40125 : c17196.m40120();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC10868 mo33989() {
        AbstractC20745 abstractC20745M40125 = m40125();
        if (abstractC20745M40125 == null) {
            abstractC20745M40125 = m40120();
        }
        if (abstractC20745M40125 == null) {
            return super.mo33989();
        }
        return new C15786(this, abstractC20745M40125);
    }
}
