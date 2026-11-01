package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: l.ۙ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R52G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4876 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5582 f17152;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object[] f17153 = new Object[2];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String[] f17154 = {C4751.class.getPackage().getName() + ".", C19694.class.getPackage().getName() + "."};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f17155;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Class[] f17151 = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final HashMap f17150 = new HashMap();

    public C4876(Context context, C5582 c5582) {
        this.f17155 = context;
        this.f17152 = c5582;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12514 m13587(int i, C13344 c13344) {
        XmlResourceParser xml = this.f17155.getResources().getXml(i);
        try {
            return m13588(xml, c13344);
        } finally {
            xml.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12514 m13588(XmlResourceParser xmlResourceParser, AbstractC12514 abstractC12514) {
        int next;
        synchronized (this.f17153) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f17153[0] = this.f17155;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (XmlPullParserException e) {
                            InflateException inflateException = new InflateException(e.getMessage());
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    } catch (InflateException e2) {
                        throw e2;
                    }
                } catch (IOException e3) {
                    InflateException inflateException2 = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            AbstractC12514 abstractC12515 = (AbstractC12514) m13584(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            if (abstractC12514 == null) {
                abstractC12515.m13146(this.f17152);
                abstractC12514 = abstractC12515;
            }
            m13586(xmlResourceParser, abstractC12514, attributeSetAsAttributeSet);
        }
        return abstractC12514;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4751 m13585(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        HashMap map = f17150;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f17155.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                    }
                    constructor = cls.getConstructor(f17151);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (ClassNotFoundException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e4);
                throw inflateException;
            }
        }
        Object[] objArr = this.f17153;
        objArr[1] = attributeSet;
        return (C4751) constructor.newInstance(objArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C4751 m13584(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return m13585(str, this.f17154, attributeSet);
            }
            return m13585(str, (String[]) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m13586(XmlPullParser xmlPullParser, C4751 c4751, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                boolean zEquals = "intent".equals(name);
                Context context = this.f17155;
                if (zEquals) {
                    try {
                        c4751.m13137(Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, c4751.m13165());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    C4751 c4751M13584 = m13584(name, attributeSet);
                    ((AbstractC12514) c4751).m31074(c4751M13584);
                    m13586(xmlPullParser, c4751M13584, attributeSet);
                }
            }
        }
    }
}
