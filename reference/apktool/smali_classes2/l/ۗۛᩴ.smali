.class public final synthetic Ll/ۗۛᩴ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ll/ܽ֡֫;

.field public final synthetic ۟:Ll/᩷ۨᩴ;

.field public final synthetic ܰ:Ljava/util/ArrayList;

.field public final synthetic ܿ:Ll/۠ۖۧ;

.field public final synthetic ᩶:[Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;[ZLl/۠ۖۧ;Ll/ܽ֡֫;Ll/᩷ۨᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗۛᩴ;->ܰ:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۗۛᩴ;->᩶:[Z

    iput-object p3, p0, Ll/ۗۛᩴ;->ܿ:Ll/۠ۖۧ;

    iput-object p4, p0, Ll/ۗۛᩴ;->֡:Ll/ܽ֡֫;

    iput-object p5, p0, Ll/ۗۛᩴ;->۟:Ll/᩷ۨᩴ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 226
    iget-object p1, p0, Ll/ۗۛᩴ;->ܰ:Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۗۛᩴ;->᩶:[Z

    invoke-static {p1, v0}, Ll/ۨۙܺ;->ۙ(Ljava/util/ArrayList;[Z)Ljava/util/ArrayList;

    move-result-object v6

    .line 227
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f120ae5

    .line 228
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 231
    :cond_0
    iget-object p1, p0, Ll/ۗۛᩴ;->ܿ:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    .line 232
    new-instance p1, Ll/ۛ᩺ᩴ;

    const/4 v5, 0x0

    invoke-static {}, Ll/ܽۛᩴ;->ۙ()Ljava/lang/String;

    move-result-object v7

    iget-object v2, p0, Ll/ۗۛᩴ;->֡:Ll/ܽ֡֫;

    iget-object v3, p0, Ll/ۗۛᩴ;->۟:Ll/᩷ۨᩴ;

    const/4 v4, 0x1

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Ll/ۛ᩺ᩴ;-><init>(Ll/ܽ֡֫;Ll/᩷ۨᩴ;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 1536
    sget-object v0, Ll/ܶ᩺ᩴ;->֡:Ll/ܶ᩺ᩴ;

    .line 1539
    invoke-virtual {p1, v0}, Ll/ۛ᩺ᩴ;->ۙ(Ll/ܶ᩺ᩴ;)V

    return-void
.end method
