package l;

import android.os.Build;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 898C */
/* JADX INFO: loaded from: classes5.dex */
public final class C17063 extends C1161 {
    @Override // l.C1161, l.AbstractC22044
    /* JADX INFO: renamed from: ۨ᩷ */
    public final boolean mo4292() {
        return false;
    }

    @Override // l.C1161, l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo4300(InterfaceC7509 interfaceC7509) {
        return false;
    }

    /* JADX INFO: renamed from: ܿ᩷, reason: not valid java name and contains not printable characters */
    public final String m40200() {
        return this.f4288.getPath();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    @Override // l.C1161, l.AbstractC22044
    /* JADX INFO: renamed from: ᩷ */
    public final List mo4299(final boolean z) {
        String strM35186;
        File[] fileArrListFiles = this.f4288.listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        if (C14584.m35213()) {
            String strMo4294 = mo4294();
            String lowerCase = strMo4294.toLowerCase(Locale.ENGLISH);
            if (lowerCase.endsWith("/android/data") || lowerCase.endsWith("/android/obb")) {
                strM35186 = C14584.m35186(strMo4294);
                if (!"Android/data".equalsIgnoreCase(strM35186) && !"Android/obb".equalsIgnoreCase(strM35186)) {
                    strM35186 = null;
                }
            } else {
                strM35186 = null;
            }
        } else {
            strM35186 = null;
        }
        return (List) C13847.stream(fileArrListFiles).filter(new Predicate() { // from class: l.ۧ᩵ᩴ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19025.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo7134negate() {
                return C19025.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19025.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return z || !((File) obj).getName().startsWith(".");
            }
        }).map(new C25269(0, strM35186)).collect(C2025.toList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ AbstractC22044 m40198(File file, String str) {
        AbstractC22044 abstractC22044M35193;
        if (str == null || Build.VERSION.SDK_INT < 30) {
            abstractC22044M35193 = C14584.m35193(m40199(file.getPath()), new String[0]);
        } else {
            String strM40199 = m40199(file.getPath());
            boolean zIsDirectory = file.isDirectory();
            C14649 c14649 = new C14649(zIsDirectory ? -1L : file.length(), file.lastModified(), zIsDirectory);
            File file2 = new File(strM40199);
            StringBuilder sbM10405 = C3188.m10405(str, "/");
            sbM10405.append(file.getName());
            abstractC22044M35193 = C14584.m35192(file2, sbM10405.toString(), c14649);
        }
        return abstractC22044M35193 instanceof InterfaceC6557 ? ((InterfaceC6557) abstractC22044M35193).mo15565() : abstractC22044M35193;
    }

    @Override // l.C1161, l.AbstractC22044
    public final String getName() {
        String name = this.f4288.getName();
        return name.equals("\u200bAndroid") ? AnalyticsConstants.SDK_TYPE : name;
    }

    @Override // l.C1161, l.AbstractC22044
    /* JADX INFO: renamed from: ܺۙ */
    public final String mo4294() {
        return m40199(this.f4288.getPath());
    }

    @Override // l.C1161, l.AbstractC22044
    public final String getParent() {
        return m40199(this.f4288.getParent());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m40199(String str) {
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
        return ExternalValue$$ExternalSyntheticOutline0.m(iIndexOf + 8, str, sb);
    }
}
