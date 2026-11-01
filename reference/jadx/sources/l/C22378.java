package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1BZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22378 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f73066 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73067;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f73068;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18144 f73069;

    public C22378(Context context, XmlResourceParser xmlResourceParser) {
        this.f73067 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C16029.f51892);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f73068 = typedArrayObtainStyledAttributes.getResourceId(index, this.f73068);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f73067);
                this.f73067 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    C18144 c18144 = new C18144();
                    this.f73069 = c18144;
                    c18144.m42253((C5444) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
