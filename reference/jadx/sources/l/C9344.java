package l;

import android.R;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.ComponentInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۡۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 21X6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9344 extends PackageManager {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f30364;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f30365;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Resources f30366;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Drawable f30367;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f30368;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f30369;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f30370;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ApplicationInfo f30371;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final PackageInfo f30372;

    @Override // android.content.pm.PackageManager
    public final boolean canRequestPackageInstalls() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final int checkPermission(String str, String str2) {
        return -1;
    }

    @Override // android.content.pm.PackageManager
    public final ChangedPackages getChangedPackages(int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final String getInstallerPackageName(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final byte[] getInstantAppCookie() {
        return new byte[0];
    }

    @Override // android.content.pm.PackageManager
    public final int getInstantAppCookieMaxBytes() {
        return 0;
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLaunchIntentForPackage(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Intent getLeanbackLaunchIntentForPackage(String str) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final FeatureInfo[] getSystemAvailableFeatures() {
        return new FeatureInfo[0];
    }

    @Override // android.content.pm.PackageManager
    public final String[] getSystemSharedLibraryNames() {
        return new String[0];
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
        return drawable;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
        return drawable;
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
        return charSequence;
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean hasSystemFeature(String str, int i) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isInstantApp(String str) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isPermissionRevokedByPolicy(String str, String str2) {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final boolean isSafeMode() {
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveActivity(Intent intent, int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final ResolveInfo resolveService(Intent intent, int i) {
        return null;
    }

    public C9344(PackageInfo packageInfo, ApplicationInfo applicationInfo, Resources resources, String str) {
        Drawable colorDrawable;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = packageInfo.packageName;
        packageInfo2.applicationInfo = packageInfo.applicationInfo == null ? null : new ApplicationInfo(packageInfo.applicationInfo);
        packageInfo2.activities = m24635(packageInfo.activities);
        packageInfo2.receivers = m24635(packageInfo.receivers);
        packageInfo2.services = m24637(packageInfo.services);
        packageInfo2.providers = m24636(packageInfo.providers);
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        packageInfo2.permissions = permissionInfoArr == null ? null : (PermissionInfo[]) permissionInfoArr.clone();
        String[] strArr = packageInfo.requestedPermissions;
        packageInfo2.requestedPermissions = strArr == null ? null : (String[]) strArr.clone();
        int[] iArr = packageInfo.requestedPermissionsFlags;
        packageInfo2.requestedPermissionsFlags = iArr == null ? null : (int[]) iArr.clone();
        int[] iArr2 = packageInfo.gids;
        packageInfo2.gids = iArr2 == null ? null : (int[]) iArr2.clone();
        Signature[] signatureArr = packageInfo.signatures;
        packageInfo2.signatures = signatureArr == null ? null : (Signature[]) signatureArr.clone();
        packageInfo2.firstInstallTime = packageInfo.firstInstallTime;
        packageInfo2.lastUpdateTime = packageInfo.lastUpdateTime;
        packageInfo2.sharedUserId = packageInfo.sharedUserId;
        packageInfo2.sharedUserLabel = packageInfo.sharedUserLabel;
        packageInfo2.versionCode = packageInfo.versionCode;
        packageInfo2.versionName = packageInfo.versionName;
        m24632(packageInfo, packageInfo2);
        this.f30372 = packageInfo2;
        this.f30371 = new ApplicationInfo(applicationInfo);
        this.f30366 = resources;
        this.f30370 = str;
        try {
            Drawable drawable = Resources.getSystem().getDrawable(R.drawable.sym_def_app_icon, null);
            if (drawable != null) {
                colorDrawable = drawable.mutate();
            } else {
                colorDrawable = new ColorDrawable(0);
            }
        } catch (Throwable unused) {
        }
        this.f30367 = colorDrawable;
        PackageInfo packageInfo3 = this.f30372;
        packageInfo3.packageName = str;
        packageInfo3.applicationInfo = this.f30371;
        this.f30365 = m24639(packageInfo3.activities);
        this.f30368 = m24639(this.f30372.receivers);
        ServiceInfo[] serviceInfoArr = this.f30372.services;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo != null && serviceInfo.packageName != null && serviceInfo.name != null) {
                    ServiceInfo serviceInfo2 = new ServiceInfo(serviceInfo);
                    linkedHashMap.put(new ComponentName(serviceInfo2.packageName, serviceInfo2.name), serviceInfo2);
                }
            }
        }
        this.f30364 = linkedHashMap;
        ProviderInfo[] providerInfoArr = this.f30372.providers;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (providerInfoArr != null) {
            for (ProviderInfo providerInfo : providerInfoArr) {
                if (providerInfo != null && providerInfo.packageName != null && providerInfo.name != null) {
                    ProviderInfo providerInfo2 = new ProviderInfo(providerInfo);
                    linkedHashMap2.put(new ComponentName(providerInfo2.packageName, providerInfo2.name), providerInfo2);
                }
            }
        }
        this.f30369 = linkedHashMap2;
        m24633(this.f30365);
        m24633(this.f30368);
        m24633(this.f30364);
        m24633(linkedHashMap2);
        this.f30372.activities = m24635((ActivityInfo[]) this.f30365.values().toArray(new ActivityInfo[0]));
        this.f30372.receivers = m24635((ActivityInfo[]) this.f30368.values().toArray(new ActivityInfo[0]));
        this.f30372.services = m24637((ServiceInfo[]) this.f30364.values().toArray(new ServiceInfo[0]));
        this.f30372.providers = m24636((ProviderInfo[]) linkedHashMap2.values().toArray(new ProviderInfo[0]));
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
        m24640(str);
        return m24630(i);
    }

    @Override // android.content.pm.PackageManager
    public final PackageInfo getPackageInfo(VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
        m24640(versionedPackage == null ? null : versionedPackage.getPackageName());
        return m24630(i);
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str) throws PackageManager.NameNotFoundException {
        m24640(str);
        return new int[]{Process.myUid()};
    }

    @Override // android.content.pm.PackageManager
    public final int[] getPackageGids(String str, int i) throws PackageManager.NameNotFoundException {
        m24640(str);
        return new int[]{Process.myUid()};
    }

    @Override // android.content.pm.PackageManager
    public final int getPackageUid(String str, int i) throws PackageManager.NameNotFoundException {
        m24640(str);
        return Process.myUid();
    }

    @Override // android.content.pm.PackageManager
    public final PermissionInfo getPermissionInfo(String str, int i) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException(str);
    }

    @Override // android.content.pm.PackageManager
    public final List queryPermissionsByGroup(String str, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final PermissionGroupInfo getPermissionGroupInfo(String str, int i) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException(str);
    }

    @Override // android.content.pm.PackageManager
    public final List getAllPermissionGroups(int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
        m24640(str);
        return new ApplicationInfo(this.f30371);
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getActivityInfo(ComponentName componentName, int i) {
        return new ActivityInfo(m24629(componentName));
    }

    @Override // android.content.pm.PackageManager
    public final ActivityInfo getReceiverInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = componentName == null ? null : (ActivityInfo) this.f30368.get(componentName);
        if (activityInfo != null) {
            return new ActivityInfo(activityInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final ServiceInfo getServiceInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ServiceInfo serviceInfo = componentName == null ? null : (ServiceInfo) this.f30364.get(componentName);
        if (serviceInfo != null) {
            return new ServiceInfo(serviceInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final ProviderInfo getProviderInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfo = componentName == null ? null : (ProviderInfo) this.f30369.get(componentName);
        if (providerInfo != null) {
            return new ProviderInfo(providerInfo);
        }
        throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledPackages(int i) {
        return Collections.singletonList(m24630(i));
    }

    @Override // android.content.pm.PackageManager
    public final List getPackagesHoldingPermissions(String[] strArr, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermission(PermissionInfo permissionInfo) {
        throw m24631("addPermission");
    }

    @Override // android.content.pm.PackageManager
    public final boolean addPermissionAsync(PermissionInfo permissionInfo) {
        throw m24631("addPermissionAsync");
    }

    @Override // android.content.pm.PackageManager
    public final void removePermission(String str) {
        throw m24631("removePermission");
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(int i, int i2) {
        return (i == Process.myUid() && i2 == Process.myUid()) ? 0 : -3;
    }

    @Override // android.content.pm.PackageManager
    public final String[] getPackagesForUid(int i) {
        if (i == Process.myUid()) {
            return new String[]{this.f30370};
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final String getNameForUid(int i) {
        if (i == Process.myUid()) {
            return this.f30370;
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final List getInstalledApplications(int i) {
        return Collections.singletonList(new ApplicationInfo(this.f30371));
    }

    @Override // android.content.pm.PackageManager
    public final void clearInstantAppCookie() {
        throw m24631("clearInstantAppCookie");
    }

    @Override // android.content.pm.PackageManager
    public final void updateInstantAppCookie(byte[] bArr) {
        throw m24631("updateInstantAppCookie");
    }

    @Override // android.content.pm.PackageManager
    public final List getSharedLibraries(int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivities(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryBroadcastReceivers(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentServices(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryIntentContentProviders(Intent intent, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final List queryContentProviders(String str, int i, int i2) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        throw new PackageManager.NameNotFoundException(componentName == null ? null : componentName.flattenToShortString());
    }

    @Override // android.content.pm.PackageManager
    public final List queryInstrumentation(String str, int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfoM24629 = m24629(componentName);
        int i = activityInfoM24629.icon;
        int i2 = activityInfoM24629.applicationInfo.icon;
        if (i == 0) {
            i = i2;
        }
        Drawable drawableM24638 = m24638(i);
        return drawableM24638 != null ? drawableM24638 : getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            throw new PackageManager.NameNotFoundException(String.valueOf(intent));
        }
        return getActivityIcon(component);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfoM24629 = m24629(componentName);
        int i = activityInfoM24629.banner;
        int i2 = activityInfoM24629.applicationInfo.banner;
        if (i == 0) {
            i = i2;
        }
        return m24638(i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityBanner(Intent intent) throws PackageManager.NameNotFoundException {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            throw new PackageManager.NameNotFoundException(String.valueOf(intent));
        }
        return getActivityBanner(component);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDefaultActivityIcon() {
        Drawable.ConstantState constantState = this.f30367.getConstantState();
        return constantState != null ? constantState.newDrawable().mutate() : new ColorDrawable(0);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
        if (!m24634(applicationInfo)) {
            return null;
        }
        Drawable drawableM24638 = m24638(applicationInfo.icon);
        return drawableM24638 != null ? drawableM24638 : getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationIcon(String str) throws PackageManager.NameNotFoundException {
        m24640(str);
        return getApplicationIcon(this.f30371);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
        if (m24634(applicationInfo)) {
            return m24638(applicationInfo.banner);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationBanner(String str) throws PackageManager.NameNotFoundException {
        m24640(str);
        return getApplicationBanner(this.f30371);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfoM24629 = m24629(componentName);
        int i = activityInfoM24629.logo;
        int i2 = activityInfoM24629.applicationInfo.logo;
        if (i == 0) {
            i = i2;
        }
        return m24638(i);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException {
        ComponentName component = intent == null ? null : intent.getComponent();
        if (component == null) {
            throw new PackageManager.NameNotFoundException(String.valueOf(intent));
        }
        return getActivityLogo(component);
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
        if (m24634(applicationInfo)) {
            return m24638(applicationInfo.logo);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getApplicationLogo(String str) throws PackageManager.NameNotFoundException {
        m24640(str);
        return getApplicationLogo(this.f30371);
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
        CharSequence text = null;
        if (!m24634(applicationInfo)) {
            return null;
        }
        CharSequence charSequence = applicationInfo.nonLocalizedLabel;
        if (charSequence != null) {
            return charSequence;
        }
        int i = applicationInfo.labelRes;
        if (i != 0) {
            try {
                text = this.f30366.getText(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return text != null ? text : applicationInfo.packageName;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForActivity(ComponentName componentName) throws PackageManager.NameNotFoundException {
        m24629(componentName);
        return this.f30366;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
        if (!m24634(applicationInfo)) {
            throw new PackageManager.NameNotFoundException(applicationInfo == null ? null : applicationInfo.packageName);
        }
        return this.f30366;
    }

    @Override // android.content.pm.PackageManager
    public final Resources getResourcesForApplication(String str) throws PackageManager.NameNotFoundException {
        m24640(str);
        return this.f30366;
    }

    @Override // android.content.pm.PackageManager
    public final void verifyPendingInstall(int i, int i2) {
        throw m24631("verifyPendingInstall");
    }

    @Override // android.content.pm.PackageManager
    public final void extendVerificationTimeout(int i, int i2, long j) {
        throw m24631("extendVerificationTimeout");
    }

    @Override // android.content.pm.PackageManager
    public final void setInstallerPackageName(String str, String str2) {
        throw m24631("setInstallerPackageName");
    }

    @Override // android.content.pm.PackageManager
    public final void addPackageToPreferred(String str) {
        throw m24631("addPackageToPreferred");
    }

    @Override // android.content.pm.PackageManager
    public final void removePackageFromPreferred(String str) {
        throw m24631("removePackageFromPreferred");
    }

    @Override // android.content.pm.PackageManager
    public final List getPreferredPackages(int i) {
        return Collections.EMPTY_LIST;
    }

    @Override // android.content.pm.PackageManager
    public final void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
        throw m24631("addPreferredActivity");
    }

    @Override // android.content.pm.PackageManager
    public final void clearPackagePreferredActivities(String str) {
        throw m24631("clearPackagePreferredActivities");
    }

    @Override // android.content.pm.PackageManager
    public final int getPreferredActivities(List list, List list2, String str) {
        list.clear();
        list2.clear();
        return 0;
    }

    @Override // android.content.pm.PackageManager
    public final void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
        throw m24631("setComponentEnabledSetting");
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationEnabledSetting(String str, int i, int i2) {
        throw m24631("setApplicationEnabledSetting");
    }

    @Override // android.content.pm.PackageManager
    public final void setApplicationCategoryHint(String str, int i) {
        throw m24631("setApplicationCategoryHint");
    }

    @Override // android.content.pm.PackageManager
    public final PackageInstaller getPackageInstaller() {
        throw m24631("getPackageInstaller");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m24640(String str) throws PackageManager.NameNotFoundException {
        if (!this.f30370.equals(str)) {
            throw new PackageManager.NameNotFoundException(str);
        }
    }

    @Override // android.content.pm.PackageManager
    public final int checkSignatures(String str, String str2) {
        String str3 = this.f30370;
        return (str3.equals(str) && str3.equals(str2)) ? 0 : -3;
    }

    @Override // android.content.pm.PackageManager
    public final int getApplicationEnabledSetting(String str) {
        return this.f30370.equals(str) ? 0 : 2;
    }

    @Override // android.content.pm.PackageManager
    public final Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
        if (this.f30370.equals(str) || m24634(applicationInfo)) {
            return m24638(i);
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
        if ((this.f30370.equals(str) || m24634(applicationInfo)) && i != 0) {
            try {
                return this.f30366.getText(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    @Override // android.content.pm.PackageManager
    public final XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
        if ((!this.f30370.equals(str) && !m24634(applicationInfo)) || i == 0) {
            return null;
        }
        try {
            return this.f30366.getXml(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m24634(ApplicationInfo applicationInfo) {
        if (applicationInfo != null) {
            return this.f30370.equals(applicationInfo.packageName);
        }
        return false;
    }

    @Override // android.content.pm.PackageManager
    public final int getComponentEnabledSetting(ComponentName componentName) {
        if (componentName != null) {
            return (this.f30365.containsKey(componentName) || this.f30368.containsKey(componentName) || this.f30364.containsKey(componentName) || this.f30369.containsKey(componentName)) ? 0 : 2;
        }
        return 2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ActivityInfo m24629(ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = componentName == null ? null : (ActivityInfo) this.f30365.get(componentName);
        if (activityInfo == null) {
            throw new PackageManager.NameNotFoundException(componentName != null ? componentName.flattenToShortString() : null);
        }
        return activityInfo;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m24639(ActivityInfo[] activityInfoArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (activityInfoArr != null) {
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (activityInfo != null && activityInfo.packageName != null && activityInfo.name != null) {
                    ActivityInfo activityInfo2 = new ActivityInfo(activityInfo);
                    linkedHashMap.put(new ComponentName(activityInfo2.packageName, activityInfo2.name), activityInfo2);
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24633(LinkedHashMap linkedHashMap) {
        for (ComponentInfo componentInfo : linkedHashMap.values()) {
            componentInfo.applicationInfo = this.f30371;
            String str = this.f30370;
            componentInfo.packageName = str;
            if (componentInfo.processName == null) {
                componentInfo.processName = str;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PackageInfo m24630(int i) {
        PackageInfo packageInfo = new PackageInfo();
        PackageInfo packageInfo2 = this.f30372;
        packageInfo.packageName = packageInfo2.packageName;
        packageInfo.applicationInfo = new ApplicationInfo(this.f30371);
        packageInfo.firstInstallTime = packageInfo2.firstInstallTime;
        packageInfo.lastUpdateTime = packageInfo2.lastUpdateTime;
        packageInfo.sharedUserId = packageInfo2.sharedUserId;
        packageInfo.sharedUserLabel = packageInfo2.sharedUserLabel;
        packageInfo.versionCode = packageInfo2.versionCode;
        packageInfo.versionName = packageInfo2.versionName;
        packageInfo.gids = new int[]{Process.myUid()};
        Signature[] signatureArr = packageInfo2.signatures;
        packageInfo.signatures = signatureArr == null ? null : (Signature[]) signatureArr.clone();
        m24632(packageInfo2, packageInfo);
        if ((i & 4096) != 0) {
            PermissionInfo[] permissionInfoArr = packageInfo2.permissions;
            packageInfo.permissions = permissionInfoArr == null ? null : (PermissionInfo[]) permissionInfoArr.clone();
            String[] strArr = packageInfo2.requestedPermissions;
            packageInfo.requestedPermissions = strArr == null ? null : (String[]) strArr.clone();
            int[] iArr = packageInfo2.requestedPermissionsFlags;
            packageInfo.requestedPermissionsFlags = iArr != null ? (int[]) iArr.clone() : null;
        }
        if ((i & 1) != 0) {
            packageInfo.activities = m24635(packageInfo2.activities);
        }
        if ((i & 2) != 0) {
            packageInfo.receivers = m24635(packageInfo2.receivers);
        }
        if ((i & 4) != 0) {
            packageInfo.services = m24637(packageInfo2.services);
        }
        if ((i & 8) != 0) {
            packageInfo.providers = m24636(packageInfo2.providers);
        }
        return packageInfo;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24632(PackageInfo packageInfo, PackageInfo packageInfo2) {
        long jLongValue;
        try {
            Field field = PackageInfo.class.getField("signingInfo");
            field.set(packageInfo2, field.get(packageInfo));
        } catch (Throwable unused) {
        }
        try {
            Field field2 = PackageInfo.class.getField("baseRevisionCode");
            field2.setInt(packageInfo2, field2.getInt(packageInfo));
        } catch (Throwable unused2) {
        }
        try {
            jLongValue = ((Number) PackageInfo.class.getMethod("getLongVersionCode", null).invoke(packageInfo, null)).longValue();
        } catch (Throwable unused3) {
            jLongValue = packageInfo.versionCode;
        }
        try {
            PackageInfo.class.getMethod("setLongVersionCode", Long.TYPE).invoke(packageInfo2, Long.valueOf(jLongValue));
        } catch (Throwable unused4) {
            packageInfo2.versionCode = (int) jLongValue;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ActivityInfo[] m24635(ActivityInfo[] activityInfoArr) {
        if (activityInfoArr == null) {
            return null;
        }
        ActivityInfo[] activityInfoArr2 = new ActivityInfo[activityInfoArr.length];
        for (int i = 0; i < activityInfoArr.length; i++) {
            activityInfoArr2[i] = activityInfoArr[i] == null ? null : new ActivityInfo(activityInfoArr[i]);
        }
        return activityInfoArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ServiceInfo[] m24637(ServiceInfo[] serviceInfoArr) {
        if (serviceInfoArr == null) {
            return null;
        }
        ServiceInfo[] serviceInfoArr2 = new ServiceInfo[serviceInfoArr.length];
        for (int i = 0; i < serviceInfoArr.length; i++) {
            serviceInfoArr2[i] = serviceInfoArr[i] == null ? null : new ServiceInfo(serviceInfoArr[i]);
        }
        return serviceInfoArr2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ProviderInfo[] m24636(ProviderInfo[] providerInfoArr) {
        if (providerInfoArr == null) {
            return null;
        }
        ProviderInfo[] providerInfoArr2 = new ProviderInfo[providerInfoArr.length];
        for (int i = 0; i < providerInfoArr.length; i++) {
            providerInfoArr2[i] = providerInfoArr[i] == null ? null : new ProviderInfo(providerInfoArr[i]);
        }
        return providerInfoArr2;
    }

    @Override // android.content.pm.PackageManager
    public final String[] canonicalToCurrentPackageNames(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.content.pm.PackageManager
    public final String[] currentToCanonicalPackageNames(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Drawable m24638(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return this.f30366.getDrawable(i, null);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SecurityException m24631(String str) {
        return new SecurityException("Decryptor PackageManager denied: ".concat(str));
    }
}
