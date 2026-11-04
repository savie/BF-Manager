.class public final synthetic Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda10;
.super Ljava/lang/Object;
.source "SearchView"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic $r8$classId:I

.field public final synthetic f$0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda10;->$r8$classId:I

    iput-object p2, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda10;->f$0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda10;->$r8$classId:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda10;->f$0:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/۠ۨܳ;

    .line 46
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-static {}, Ll/۫ۤܺ;->ܺ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Ll/᩶֡֫;->ۙ(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView$$ExternalSyntheticLambda10;->f$0:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/search/SearchView;

    invoke-static {v0, p1}, Lcom/google/android/material/search/SearchView;->$r8$lambda$jEPC5P2snL5cxZFNR2VSY2U-D-U(Lcom/google/android/material/search/SearchView;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
