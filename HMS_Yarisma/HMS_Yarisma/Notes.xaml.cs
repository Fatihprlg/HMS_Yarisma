using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace HMS_Yarisma
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class Notes : ContentPage
    {
        public static List<NoteClass> notes = new List<NoteClass>();
        protected override void OnAppearing()
        {
            base.OnAppearing();
            
            if (notes.Count > 0)
            {
                emptyNote.IsVisible = false;
                int a = 0;
                foreach (NoteClass note in notes)
                {
                    ScreenLoad(note.Header, note.Text, a);
                    a += 110;
                }
            }
            else
            {
                emptyNote.IsVisible = true;
            }
        }
        public Notes()
        {
            InitializeComponent();

            
        }
        private void EditBtn_Clicked(object sender, EventArgs e)
        {

        }


        private async void AddButton_Clicked(object sender, EventArgs e)
        {
            await Navigation.PushAsync(new Page1());
        }

        void ScreenLoad(string NoteHeader, string NoteText, int def)
        {
            AbsoluteLayout absoluteLayout = new AbsoluteLayout();
            //absoluteLayout.HeightRequest = 100;
            mainRelative.Children.Add(absoluteLayout, Constraint.Constant(5), Constraint.Constant(def + 110),
                Constraint.RelativeToParent((parent) => { return parent.Width; }), Constraint.Constant(100));
            BoxView boxView = new BoxView()
            {
                BackgroundColor = Color.FromHex("#e6e6e6"),
                CornerRadius = 10,
                Margin = new Thickness(10, 0)
            };

            absoluteLayout.Children.Add(boxView, new Rectangle(0, 0, 1, 1), AbsoluteLayoutFlags.All);
            Label headerLbl = new Label()
            {
                Text = NoteHeader,
                Margin = new Thickness(10, 0),
                FontSize = 24,
                TextColor = Color.Black
            };
            absoluteLayout.Children.Add(headerLbl);
            Label textLbl = new Label()
            {
                Margin = new Thickness(20, 30, 20, 5),
                LineBreakMode = LineBreakMode.TailTruncation,
                MaxLines = 3,
                Text = NoteText
            };
            textLbl.FontSize = Device.GetNamedSize(NamedSize.Caption, textLbl);
            absoluteLayout.Children.Add(textLbl);
            ImageButton editBtn = new ImageButton()
            {
                Margin = 5,
                Scale = 0.5f,
                Source = "pencil.png",
                BackgroundColor = Color.Transparent,
                Aspect = Aspect.AspectFit
            };
            editBtn.Clicked += EditBtn_Clicked;
            absoluteLayout.Children.Add(editBtn, new Rectangle(0, 0, 1.85, 0.35), AbsoluteLayoutFlags.All);
        }
    }
}