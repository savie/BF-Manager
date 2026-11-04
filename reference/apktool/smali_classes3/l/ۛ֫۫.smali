.class public final synthetic Ll/ۛ֫۫;
.super Ljava/lang/Object;
.source "895N"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ljava/util/List;

.field public final synthetic ᩶:Ll/۫ۛܳ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ll/۫ۛܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ֫۫;->ܰ:Ljava/util/List;

    iput-object p2, p0, Ll/ۛ֫۫;->᩶:Ll/۫ۛܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 55
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 56
    iget-object p1, p0, Ll/ۛ֫۫;->ܰ:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۢۗܳ;

    iget-object p2, p0, Ll/ۛ֫۫;->᩶:Ll/۫ۛܳ;

    invoke-virtual {p1, p2}, Ll/ۢۗܳ;->ۤ(Ll/۫ۛܳ;)V

    return-void
.end method
