package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: I53K */
/* JADX INFO: loaded from: classes2.dex */
public final class C4053 implements Iterable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f14952 = new ArrayList();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ActivityC10074 f14953;

    public C4053(ActivityC10074 activityC10074) {
        this.f14953 = activityC10074;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C4053 m11557(ActivityC10074 activityC10074) {
        return new C4053(activityC10074);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11558(ActivityC10074 activityC10074) {
        Intent intentMo25487 = activityC10074.mo25487();
        if (intentMo25487 == null) {
            intentMo25487 = C2166.m6745(activityC10074);
        }
        if (intentMo25487 != null) {
            ComponentName component = intentMo25487.getComponent();
            ActivityC10074 activityC10075 = this.f14953;
            if (component == null) {
                component = intentMo25487.resolveActivity(activityC10075.getPackageManager());
            }
            ArrayList arrayList = this.f14952;
            int size = arrayList.size();
            try {
                for (Intent intentM6746 = C2166.m6746(activityC10075, component); intentM6746 != null; intentM6746 = C2166.m6746(activityC10075, intentM6746.getComponent())) {
                    arrayList.add(size, intentM6746);
                }
                arrayList.add(intentMo25487);
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.f14952.iterator();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11559() {
        ArrayList arrayList = this.f14952;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f14953.startActivities(intentArr, null);
    }
}
