package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۨۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: G16V */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC11620 extends AbstractActivityC12483 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39032 = 0;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public C13737 f39033;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public List f39034 = Collections.EMPTY_LIST;

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "SchemeManagerActivity";
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.string.MT_Protector);
        m31016(R.layout.MT_Protector);
        this.f41645 = (C6938) m31016(R.id.MT_Protector);
        ListView listView = (ListView) m31016(android.R.id.list);
        m31004(this.f41645);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC12603(this, 1));
        this.f39034 = C14920.m35666();
        C13737 c13737 = new C13737(this);
        this.f39033 = c13737;
        listView.setAdapter((ListAdapter) c13737);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
    }

    @Override // l.AbstractActivityC12483, l.ActivityC19126, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f39034 = C14920.m35666();
        this.f39033.notifyDataSetChanged();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            C9276 c9276 = new C9276(this, this);
            c9276.m40376(R.string.MT_Protector);
            c9276.m40340();
            c9276.m40336(6);
            c9276.m40368(true);
            return true;
        }
        if (itemId != R.id.MT_Protector) {
            return false;
        }
        try {
            C17367 c17367M40441 = C17367.m40441(Base64.decode(C16737.m39296().trim(), 3));
            C20190.m45649((InterfaceC0433) c17367M40441, -2106428910);
            String strM40458 = c17367M40441.m40458();
            String strM40459 = c17367M40441.m40458();
            if (strM40459.hashCode() != c17367M40441.readInt()) {
                throw new Exception();
            }
            C22681 c22681 = new C22681(C14920.m35660(strM40458));
            c22681.m50241(new JSONObject(strM40459));
            C14920.m35664(c22681);
            this.f39034 = C14920.m35666();
            this.f39033.notifyDataSetChanged();
            C15829.m37611(R.string.MT_Protector);
            return true;
        } catch (Exception unused) {
            C15829.m37611(R.string.MT_Protector);
            return true;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.f39034.get(i);
        Intent intent = new Intent(this, (Class<?>) ActivityC23387.class);
        intent.putExtra("schemeName", str);
        startActivity(intent);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, final int i, long j) {
        C16195 c16195 = new C16195(this, view, 0);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        c16195.m38296(new InterfaceC21133() { // from class: l.ܳ֫ۨ
            @Override // l.InterfaceC21133
            public final boolean onMenuItemClick(MenuItem menuItem) {
                ActivityC11620.m28959(this.f46604, i, menuItem);
                return true;
            }
        });
        C2766.m8440(view, c16195);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28959(final ActivityC11620 activityC11620, int i, MenuItem menuItem) {
        final String str = (String) activityC11620.f39034.get(i);
        int i2 = 3;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            try {
                String string = C14920.m35665(str).m50242().toString();
                C11018 c11018 = new C11018();
                c11018.writeInt(-2106428910);
                c11018.m27786(str);
                c11018.m27786(string);
                c11018.writeInt(string.hashCode());
                C16737.m39272((CharSequence) Base64.encodeToString(c11018.m27789(), 3));
                return;
            } catch (Exception e) {
                activityC11620.m31002(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            C2924 c2924 = new C2924(activityC11620, activityC11620, str);
            c2924.m40376(R.string.MT_Protector);
            c2924.m40346((CharSequence) str);
            c2924.m40340();
            c2924.m40336(6);
            c2924.m40355();
            c2924.m40368(true);
            return;
        }
        if (menuItem.getItemId() == R.string.MT_Protector) {
            int i3 = DialogInterfaceC19356.f62401;
            C8067 c8067 = new C8067(activityC11620);
            c8067.m21274(R.string.MT_Protector);
            c8067.m21261(activityC11620.getString(R.string.MT_Protector, str));
            c8067.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.֫֫ۨ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ActivityC11620.m28960(this.f6208, str);
                }
            });
            c8067.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
            c8067.m21269();
            return;
        }
        String string2 = str + 2;
        while (C14920.m35667(string2)) {
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(i2);
            string2 = sbM23356.toString();
            i2++;
        }
        C4563 c4563 = new C4563(activityC11620, activityC11620, str);
        c4563.m40376(R.string.MT_Protector);
        c4563.m40346((CharSequence) string2);
        c4563.m40340();
        c4563.m40336(6);
        c4563.m40355();
        c4563.m40368(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m28960(ActivityC11620 activityC11620, String str) {
        C14920.m35662(str);
        activityC11620.f39034 = C14920.m35666();
        activityC11620.f39033.notifyDataSetChanged();
    }
}
