package l;

import android.content.pm.PackageInfo;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩹᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23904 implements Comparator {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f77387;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f77387) {
            case 0:
                PackageInfo packageInfo = (PackageInfo) obj;
                PackageInfo packageInfo2 = (PackageInfo) obj2;
                boolean z = (packageInfo.applicationInfo.flags & 129) == 0;
                if (z == ((packageInfo2.applicationInfo.flags & 129) == 0)) {
                    return packageInfo.packageName.compareToIgnoreCase(packageInfo2.packageName);
                }
                return z ? -1 : 1;
            default:
                return ((C10734) obj).f34087.compareTo(((C10734) obj2).f34087);
        }
    }
}
