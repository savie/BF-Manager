package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes2.dex */
public final class C2893 extends MenuInflater {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Class[] f10918;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Class[] f10919;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object f10920;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f10921;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Context f10922;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object[] f10923;

    static {
        Class[] clsArr = {Context.class};
        f10919 = clsArr;
        f10918 = clsArr;
    }

    public C2893(Context context) {
        super(context);
        this.f10922 = context;
        Object[] objArr = {context};
        this.f10923 = objArr;
        this.f10921 = objArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC1957)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f10922.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C12418) {
                    C12418 c12418 = (C12418) menu;
                    if (c12418.isDispatchingItemsChanged()) {
                        c12418.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                m8701(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((C12418) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((C12418) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8701(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C9245 c9245 = new C9245(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got ".concat(name));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        c9245.m23757();
                    } else if (name2.equals("item")) {
                        if (!c9245.m23760()) {
                            AbstractC5674 abstractC5674 = c9245.f31408;
                            if (abstractC5674 != null && abstractC5674.mo15568()) {
                                c9245.m23761();
                            } else {
                                c9245.m23758();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c9245.m23759(attributeSet);
                } else if (name3.equals("item")) {
                    c9245.m23762(attributeSet);
                } else if (name3.equals("menu")) {
                    m8701(xmlPullParser, attributeSet, c9245.m23761());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m8702() {
        if (this.f10920 == null) {
            this.f10920 = m8700(this.f10922);
        }
        return this.f10920;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m8700(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m8700(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
