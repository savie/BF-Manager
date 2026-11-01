package l;

import android.os.Build;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 898C */
/* JADX INFO: loaded from: classes5.dex */
public final class C14705 extends C15432 {
    @Override // l.C15432, l.AbstractC20745
    /* JADX INFO: renamed from: ۡܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo35233() {
        return false;
    }

    @Override // l.C15432, l.AbstractC20745
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo35234(InterfaceC5614 interfaceC5614) {
        return false;
    }

    /* JADX INFO: renamed from: ֡ܰ, reason: not valid java name and contains not printable characters */
    public final String m35232() {
        return this.f50294.getPath();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // l.C15432, l.AbstractC20745
    /* JADX INFO: renamed from: ܰ */
    public final List mo33983(final boolean z) {
        String strM15306;
        File[] fileArrListFiles = this.f50294.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        if (C5553.m15303()) {
            String strMo33986 = mo33986();
            String lowerCase = strMo33986.toLowerCase(Locale.ENGLISH);
            if (lowerCase.endsWith("/android/data") || lowerCase.endsWith("/android/obb")) {
                strM15306 = C5553.m15306(strMo33986);
                if (!"Android/data".equalsIgnoreCase(strM15306) && !"Android/obb".equalsIgnoreCase(strM15306)) {
                    strM15306 = null;
                }
            } else {
                strM15306 = null;
            }
        } else {
            strM15306 = null;
        }
        return (List) C20318.stream(fileArrListFiles).filter(new Predicate() { // from class: l.ۧᩴۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C23877(0, strM15306)).collect(C1890.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ AbstractC20745 m35230(File file, String str) {
        AbstractC20745 abstractC20745M15313;
        if (str == null || Build.VERSION.SDK_INT < 30) {
            abstractC20745M15313 = C5553.m15313(m35231(file.getPath()), new String[0]);
        } else {
            String strM35231 = m35231(file.getPath());
            boolean zIsDirectory = file.isDirectory();
            C16491 c16491 = new C16491(zIsDirectory ? -1L : file.length(), file.lastModified(), zIsDirectory);
            File file2 = new File(strM35231);
            StringBuilder sbM8976 = C3012.m8976(str, "/");
            sbM8976.append(file.getName());
            abstractC20745M15313 = C5553.m15312(file2, sbM8976.toString(), c16491);
        }
        return abstractC20745M15313 instanceof InterfaceC16034 ? ((InterfaceC16034) abstractC20745M15313).mo8445() : abstractC20745M15313;
    }

    @Override // l.C15432, l.AbstractC20745
    public final String getName() {
        String name = this.f50294.getName();
        return name.equals("\u200bAndroid") ? AnalyticsConstants.SDK_TYPE : name;
    }

    @Override // l.C15432, l.AbstractC20745
    /* JADX INFO: renamed from: ܶۙ */
    public final String mo33986() {
        return m35231(this.f50294.getPath());
    }

    @Override // l.C15432, l.AbstractC20745
    public final String getParent() {
        return m35231(this.f50294.getParent());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m35231(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf("\u200bAndroid");
        if (iIndexOf < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, iIndexOf));
        sb.append(AnalyticsConstants.SDK_TYPE);
        return C0242.m1616(iIndexOf + 8, str, sb);
    }
}
