package l;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: l.ܿ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C18168 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Configuration f59393;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ColorStateList f59394;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f59395;

    public C18168(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f59394 = colorStateList;
        this.f59393 = configuration;
        this.f59395 = theme == null ? 0 : theme.hashCode();
    }
}
