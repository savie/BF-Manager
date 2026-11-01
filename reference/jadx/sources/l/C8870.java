package l;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: l.ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8870 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Configuration f30421;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ColorStateList f30422;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f30423;

    public C8870(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f30422 = colorStateList;
        this.f30421 = configuration;
        this.f30423 = theme == null ? 0 : theme.hashCode();
    }
}
