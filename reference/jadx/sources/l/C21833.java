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

/* JADX INFO: renamed from: l.᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes.dex */
public final class C21833 extends MenuInflater {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Class[] f69585;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Class[] f69586;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f69587;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Context f69588;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object[] f69589;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f69590;

    static {
        Class[] clsArr = {Context.class};
        f69585 = clsArr;
        f69586 = clsArr;
    }

    public C21833(Context context) {
        super(context);
        this.f69588 = context;
        Object[] objArr = {context};
        this.f69589 = objArr;
        this.f69587 = objArr;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC10774)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f69588.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof C9898) {
                    C9898 c9898 = (C9898) menu;
                    if (c9898.isDispatchingItemsChanged()) {
                        c9898.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                m49502(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((C9898) menu).startDispatchingItemsChanged();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((C9898) menu).startDispatchingItemsChanged();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m49502(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C4679 c4679 = new C4679(this, menu);
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
                        c4679.m14546();
                    } else if (name2.equals("item")) {
                        if (!c4679.m14543()) {
                            AbstractC15227 abstractC15227 = c4679.f16526;
                            if (abstractC15227 != null && abstractC15227.mo19196()) {
                                c4679.m14544();
                            } else {
                                c4679.m14541();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    c4679.m14542(attributeSet);
                } else if (name3.equals("item")) {
                    c4679.m14545(attributeSet);
                } else if (name3.equals("menu")) {
                    m49502(xmlPullParser, attributeSet, c4679.m14544());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m49503() {
        if (this.f69590 == null) {
            this.f69590 = m49501(this.f69588);
        }
        return this.f69590;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m49501(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m49501(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
