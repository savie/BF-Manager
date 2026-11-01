package l;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX INFO: renamed from: l.ܿ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 922P */
/* JADX INFO: loaded from: classes4.dex */
public class AppComponentFactoryC17563 extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m40835(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m40835(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m40835(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m40835(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m40835(super.instantiateService(classLoader, str, intent));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m40835(Object obj) {
        Object objM31408;
        return (!(obj instanceof InterfaceC12625) || (objM31408 = ((InterfaceC12625) obj).m31408()) == null) ? obj : objM31408;
    }
}
