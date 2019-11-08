package com.example.android.miwok;

public class ReportCard {

    private String mChemistryGrade;

    private String mBiologyGrade;

    private String mMathGrade;

    private String mEnglishGrade;

    private String mStudentName;

    private int mCourseYear;

    /**
     * The Constructor. Create a new ReportCard object.
     *
     * @param studentName    Name of the student
     * @param courseYear     Course year
     * @param chemistryGrade Chemistry grade
     * @param biologyGrade   Biology grade
     * @param mathGrade      Math grade
     * @param englishGrade   English grade
     */

    public ReportCard(String chemistryGrade, String biologyGrade, String mathGrade, String englishGrade, String studentName, int courseYear) {
        mChemistryGrade = chemistryGrade;
        mBiologyGrade = biologyGrade;
        mMathGrade = mathGrade;
        mEnglishGrade = englishGrade;
        mStudentName = studentName;
        mCourseYear = courseYear;
    }


    // All the getter methods of this class where
    // this class get the grades of each subject

    public String getStudentName() {
        return mStudentName;
    }

    public int getCourseYear() {
        return mCourseYear;
    }

    public String getChemistryGrade() {
        return mChemistryGrade;
    }

    public String getBiologyGrade() {
        return mBiologyGrade;
    }

    public String getMathGrade() {
        return mMathGrade;
    }

    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    // All the setter method of report card class where
    // the class set the strings

    public void setChemistryGrade(String chemGrade) {
        mChemistryGrade = chemGrade;
    }

    public void setBiologyGrade(String bioGrade) {
        mBiologyGrade = bioGrade;
    }

    public void setMathGrade(String mathGrade) {
        mMathGrade = mathGrade;
    }

    public void setEnglishGrade(String engGrade) {
        mEnglishGrade = engGrade;
    }

    public void setStudentName(String studentName) {
        mStudentName = studentName;
    }

    public void setCourseYear(int courseYear) {
        mCourseYear = courseYear;
    }

    @Override
    public String toString() {

        return "Student Name:" + mStudentName + "\n" +
                "Course Year:" + mCourseYear + "\n" +
                "Chemistry Grade:" + mChemistryGrade + "\n" +
                "Biology Grade:" + mBiologyGrade + "\n" +
                "English Grade:" + mEnglishGrade + "\n" +
                "Maths Grade:" + mMathGrade;
    }
}
