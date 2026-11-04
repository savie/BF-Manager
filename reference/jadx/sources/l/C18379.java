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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18379 extends AbstractC22044 implements InterfaceC6557 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static String f59878 = "";

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f59880;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f59881;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C15593 f59882;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22307 f59883;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C14649 f59884;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final File f59885;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C4209 f59876 = new C4209();

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final C17930 f59879 = new C17930();

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final C24720 f59874 = C24720.m55194(2000);

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static String f59877 = "";

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f59875 = new HashMap();

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo4291() {
        return false;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4293() {
        return true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18379 mo42890() {
        return this;
    }

    static {
        if (C14584.m35204()) {
            return;
        }
        if (C14584.m35213() || C13903.m33860()) {
            String string = C23053.m51953(C14584.m35213() ? "primary:\u200bAndroid" : "primary:Android/", false).toString();
            C15243.m36591(string, "toString(...)");
            List<UriPermission> persistedUriPermissions = C21576.m49084().getContentResolver().getPersistedUriPermissions();
            C15243.m36591(persistedUriPermissions, "getPersistedUriPermissions(...)");
            for (UriPermission uriPermission : persistedUriPermissions) {
                if (uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                    Uri uri = uriPermission.getUri();
                    String string2 = uri.toString();
                    C15243.m36591(string2, "toString(...)");
                    if (string2.startsWith(string)) {
                        String str = uri.getPathSegments().get(1);
                        C15243.m36591(str, "get(...)");
                        String strSubstring = str.substring(8);
                        C15243.m36591(strSubstring, "substring(...)");
                        f59875.put(strSubstring, uri);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ */
    public final ParcelFileDescriptor mo4279(String str) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorMo4279;
        C15243.m36590(str, "mode");
        try {
            return this.f59883.mo4279(str);
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 == null || (parcelFileDescriptorMo4279 = c15593M42877.mo4279(str)) == null) {
                throw new IOException("Permission denied: ".concat(mo4294()));
            }
            return parcelFileDescriptorMo4279;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4301(AbstractC22044 abstractC22044) {
        C15593 c15593M42877;
        C15243.m36590(abstractC22044, "tar");
        try {
            return this.f59883.mo4301(abstractC22044 instanceof C18379 ? ((C18379) abstractC22044).f59883 : abstractC22044);
        } catch (C11118 unused) {
            C15593 c15593M42878 = m42877();
            if (c15593M42878 == null) {
                return false;
            }
            if ((abstractC22044 instanceof C18379) && (c15593M42877 = ((C18379) abstractC22044).m42877()) != null) {
                abstractC22044 = c15593M42877;
            }
            return c15593M42878.mo4301(abstractC22044);
        }
    }

    public C18379(File file, String str, String str2, C22307 c22307, C14649 c14649) {
        C15243.m36590(file, "file");
        C15243.m36590(str, "relativePath");
        C15243.m36590(str2, "treePrimaryPath");
        this.f59885 = file;
        this.f59880 = str;
        this.f59881 = str2;
        this.f59883 = c22307;
        this.f59884 = c14649;
    }

    /* JADX INFO: renamed from: ۟᩷, reason: not valid java name and contains not printable characters */
    public final String m42887() {
        return this.f59881;
    }

    /* JADX INFO: renamed from: ۖ᩷, reason: not valid java name and contains not printable characters */
    private final C15593 m42877() {
        C15593 c15593 = this.f59882;
        if (c15593 != null) {
            return c15593;
        }
        String str = this.f59881;
        if (!C4209.m13460(str)) {
            return null;
        }
        C15593 c15594 = new C15593(this.f59885, new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str)).appendPath("document").appendPath("primary:" + this.f59880).build());
        this.f59882 = c15594;
        return c15594;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛ */
    public final boolean mo37325() {
        return C4013.m12986().mo29537();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۘ */
    public final boolean mo4277() {
        return C4013.m12986().mo29537();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18379(File file, String str, String str2) {
        this(file, str, str2, new C22307(file, C4013.m12986().mo29539() ? new File(ExternalValue$$ExternalSyntheticOutline0.m("/data/media/", C6382.f21566.getName(), "/", str)) : file, str, str2), null);
        C15243.m36590(str, "relativePath");
        C15243.m36590(str2, "treePrimaryPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18379(File file, String str, String str2, C14649 c14649) {
        this(file, str, str2, new C22307(file, C4013.m12986().mo29539() ? new File(ExternalValue$$ExternalSyntheticOutline0.m("/data/media/", C6382.f21566.getName(), "/", str)) : file, str, str2), c14649);
        C15243.m36590(file, "file");
        C15243.m36590(str, "relativePath");
        C15243.m36590(str2, "treePrimaryPath");
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠ */
    public final AbstractC22044 mo4284() {
        File absoluteFile = this.f59885.getAbsoluteFile();
        C15243.m36591(absoluteFile, "getAbsoluteFile(...)");
        return new C18379(absoluteFile, this.f59880, this.f59881, this.f59884);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo4278() {
        String absolutePath = this.f59885.getAbsolutePath();
        C15243.m36591(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // l.InterfaceC6557
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22044 mo15565() {
        C22307 c22307 = this.f59883;
        if (c22307 instanceof C5153) {
            return this;
        }
        return new C18379(this.f59885, this.f59880, this.f59881, c22307.mo15565(), this.f59884);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۟ */
    public final boolean mo4283() {
        try {
            f59876.getClass();
            return this.f59883.mo4283();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4283();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֡ */
    public final boolean mo4274() {
        try {
            f59876.getClass();
            return this.f59883.mo4274();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4274();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    public final String getName() {
        String name = this.f59885.getName();
        C15243.m36591(name, "getName(...)");
        return name;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܺۙ */
    public final String mo4294() {
        String path = this.f59885.getPath();
        C15243.m36591(path, "getPath(...)");
        return path;
    }

    @Override // l.AbstractC22044
    public final String getParent() {
        return this.f59885.getParent();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo4296() {
        try {
            f59876.getClass();
            return this.f59883.mo4296();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4296();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo4287() {
        try {
            f59876.getClass();
            return this.f59883.mo4287();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4296();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2934() {
        try {
            f59876.getClass();
            return this.f59883.mo2934();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo2934();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ۙ */
    public final boolean mo4304() {
        C14649 c14649 = this.f59884;
        if (c14649 != null) {
            return !c14649.m35282();
        }
        try {
            f59876.getClass();
            return this.f59883.mo4304();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4304();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛۙ */
    public final boolean mo4281() {
        C14649 c14649 = this.f59884;
        if (c14649 != null) {
            return c14649.m35282();
        }
        try {
            f59876.getClass();
            return this.f59883.mo4281();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4281();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩵ۙ */
    public final boolean mo4297() {
        if (this.f59884 != null) {
            return true;
        }
        try {
            return this.f59883.mo4297();
        } catch (C11118 unused) {
            return m42877() != null;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۠ۙ */
    public final long mo4285() {
        C14649 c14649 = this.f59884;
        if (c14649 != null) {
            return c14649.m35283();
        }
        try {
            return this.f59883.mo4285();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4285();
            }
            return -1L;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۡۙ */
    public final long mo4286() {
        C14649 c14649 = this.f59884;
        if (c14649 != null) {
            return c14649.m35281();
        }
        try {
            return this.f59883.mo4286();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4286();
            }
            return 0L;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2942(long j) {
        if (j < 0) {
            return false;
        }
        try {
            return this.f59883.mo2942(j);
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            return c15593M42877 != null ? c15593M42877.mo2942(j) : false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۛ᩷ */
    public final boolean mo2945() {
        try {
            this.f59883.mo2945();
            return true;
        } catch (C11118 unused) {
            return m42877() != null;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩹ */
    public final boolean mo4302() {
        try {
            f59876.getClass();
            return this.f59883.mo4302();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4302();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ */
    public final boolean mo4303() {
        try {
            return this.f59883.mo4303();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4303();
            }
            return false;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18555 mo2938(InterfaceC21539 interfaceC21539) {
        try {
            return this.f59883.mo2938(interfaceC21539);
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            return c15593M42877 != null ? c15593M42877.mo2938(interfaceC21539) : super.mo2938(interfaceC21539);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final List mo4299(boolean z) {
        File file = this.f59885;
        String str = this.f59880;
        try {
            List listMo4299 = this.f59883.mo4299(z);
            if (Build.VERSION.SDK_INT >= 34 && C4013.m12986().mo29538() && (C0878.m3578(str, "Android/data") || C0878.m3578(str, "Android/obb"))) {
                for (String str2 : C3463.m11397((Set) C1170.stream(listMo4299).map(new C24057(new C12412())).collect(C2025.toSet()), str)) {
                    String str3 = str + "/" + str2;
                    listMo4299.add(new C18379(new File(file, str2), str3, str3));
                }
            }
            C15243.m36586(listMo4299);
            return listMo4299;
        } catch (C11118 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C0878.m3578(str, "Android/data")) {
                    ArrayList arrayListM41284 = i == 33 ? C17633.m41284(this) : C23601.m52839(this);
                    if (mo4294().equals(f59878)) {
                        C4209.m13458(str);
                    }
                    return arrayListM41284;
                }
                if (C0878.m3578(str, "Android/obb")) {
                    ArrayList arrayListM41288 = i == 33 ? C17633.m41288(this) : C23601.m52843(this);
                    if (mo4294().equals(f59878)) {
                        C4209.m13458(str);
                    }
                    return arrayListM41288;
                }
            }
            C15593 c15593M42877 = m42877();
            String str4 = this.f59881;
            if (c15593M42877 == null) {
                if (mo4294().equals(f59878)) {
                    C4209.m13458(str4);
                }
                return new ArrayList();
            }
            List listMo42910 = c15593M42877.mo4299(z);
            ArrayList arrayList = new ArrayList(C7743.m21084((Iterable) listMo42910));
            for (AbstractC22044 abstractC22044 : (ArrayList) listMo42910) {
                String name = abstractC22044.getName();
                C18379 c18379 = new C18379(new File(file, name), C20196.m46451(str, "/", name), str4);
                c18379.f59882 = (C15593) abstractC22044;
                arrayList.add(c18379);
            }
            return C7743.m21091(arrayList);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۜۙ */
    public final List mo4282() {
        String str = this.f59880;
        try {
            List listMo4282 = this.f59883.mo4282();
            if (Build.VERSION.SDK_INT >= 34 && C4013.m12986().mo29538() && (C0878.m3578(str, "Android/data") || C0878.m3578(str, "Android/obb"))) {
                List listM11397 = C3463.m11397(new HashSet(listMo4282), str);
                C15243.m36586(listM11397);
                listMo4282.addAll(listM11397);
            }
            C15243.m36586(listMo4282);
            return listMo4282;
        } catch (C11118 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C0878.m3578(str, "Android/data")) {
                    if (mo4294().equals(f59878)) {
                        C4209.m13458(str);
                    }
                    if (i == 33) {
                        return C17633.m41282();
                    }
                    return C23601.m52837();
                }
                if (C0878.m3578(str, "Android/obb")) {
                    if (mo4294().equals(f59878)) {
                        C4209.m13458(str);
                    }
                    if (i == 33) {
                        return C17633.m41286();
                    }
                    return C23601.m52841();
                }
            }
            C15593 c15593M42877 = m42877();
            if (c15593M42877 == null) {
                if (mo4294().equals(f59878)) {
                    C4209.m13458(this.f59881);
                }
                return new ArrayList();
            }
            List listMo4283 = c15593M42877.mo4282();
            C15243.m36586(listMo4283);
            return listMo4283;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۧ᩷ */
    public final InputStream mo4290() throws IOException {
        InputStream inputStreamMo4290;
        try {
            f59876.getClass();
            return this.f59883.mo4290();
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 == null || (inputStreamMo4290 = c15593M42877.mo4290()) == null) {
                throw new IOException("Permission denied: ".concat(mo4294()));
            }
            return inputStreamMo4290;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤ */
    public final OutputStream mo4289(boolean z) throws IOException {
        OutputStream outputStreamMo4289;
        try {
            return this.f59883.mo4289(z);
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 == null || (outputStreamMo4289 = c15593M42877.mo4289(z)) == null) {
                throw new IOException("Permission denied: ".concat(mo4294()));
            }
            return outputStreamMo4289;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۚ᩷ */
    public final FileChannel mo4280() throws IOException {
        try {
            FileChannel fileChannelMo4280 = this.f59883.mo4280();
            C15243.m36586(fileChannelMo4280);
            return fileChannelMo4280;
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 == null) {
                throw new IOException("Permission denied: ".concat(mo4294()));
            }
            c15593M42877.mo4280();
            throw null;
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15475 mo4276(String str) throws IOException {
        try {
            return this.f59883.mo4276(str);
        } catch (C11118 unused) {
            C15593 c15593M42877 = m42877();
            if (c15593M42877 != null) {
                return c15593M42877.mo4276(str);
            }
            throw new IOException("Permission denied: ".concat(mo4294()));
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo42886() {
        return (C4013.m12986().mo29537() || m42877() == null) ? false : true;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final Uri mo42888() {
        if (!mo42886()) {
            throw new UnsupportedOperationException();
        }
        C15593 c15593M42877 = m42877();
        C15243.m36586(c15593M42877);
        Uri uriMo42888 = c15593M42877.mo42888();
        C15243.m36591(uriMo42888, "getContentUri(...)");
        return uriMo42888;
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final C7302 m42889() {
        if (C4013.m12986().mo29537()) {
            return this.f59883;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC22044 m42878(C18379 c18379) {
        C7302 c7302M42889 = c18379.m42889();
        return c7302M42889 != null ? c7302M42889 : c18379.m42877();
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC11601 mo4298() {
        AbstractC22044 abstractC22044M42889 = m42889();
        if (abstractC22044M42889 == null) {
            abstractC22044M42889 = m42877();
        }
        if (abstractC22044M42889 == null) {
            return super.mo4298();
        }
        return new C6447(this, abstractC22044M42889);
    }
}
