package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K22K */
/* JADX INFO: loaded from: classes4.dex */
public final class C14784 implements InterfaceC2082 {
    @Override // l.InterfaceC2082
    /* JADX INFO: renamed from: ۙ */
    public final Drawable mo6600(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        String classAttribute = attributeSet.getClassAttribute();
        if (classAttribute != null) {
            try {
                Drawable drawable = (Drawable) C14784.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                C20533.m46315(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                return drawable;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
