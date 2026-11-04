.class public final synthetic Ll/ۛܽܳ;
.super Ljava/lang/Object;
.source "76ID"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ܰ:Ll/᩶ܽܳ;

.field public final synthetic ᩶:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ܽܳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛܽܳ;->ܰ:Ll/᩶ܽܳ;

    iput-object p2, p0, Ll/ۛܽܳ;->᩶:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۛܽܳ;->ܰ:Ll/᩶ܽܳ;

    iget-object v1, p0, Ll/ۛܽܳ;->᩶:Ljava/util/ArrayList;

    invoke-static {v0, v1, p1}, Ll/᩶ܽܳ;->ۙ(Ll/᩶ܽܳ;Ljava/util/ArrayList;Landroid/view/View;)V

    const/4 p1, 0x1

    return p1
.end method
